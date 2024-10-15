import serial
import time

def connect_to_hc05(incoming_port, outgoing_port):

    try:

        # Open the incoming (read) port

        ser_in = serial.Serial(incoming_port, 9600, timeout=1)

        # Open the outgoing (write) port

        ser_out = serial.Serial(outgoing_port, 9600, timeout=1)

        print(f"Connected to HC-05 on {incoming_port} (incoming) and {outgoing_port} (outgoing)!")

        # Send data to the HC-05
        
        ser_out.write(b'Hello from Python!\n')
        time.sleep(1)

        # Check for incoming data
        if ser_in.in_waiting > 0:
            received_data = ser_in.read(ser_in.in_waiting).decode('utf-8').strip()
            print(f"Received: {received_data}")

        # Close the ports
        ser_in.close()
        ser_out.close()

    except (serial.SerialException, OSError) as e:

        print(f"Failed to communicate with HC-05 on {incoming_port}/{outgoing_port}: {e}")

if __name__ == "__main__":

    incoming_port = 'COM8'
    outgoing_port = 'COM7'
    connect_to_hc05(incoming_port, outgoing_port)

# import serial
# import serial.tools.list_ports
# import time

# def find_hc05():
#     # List all available ports
#     ports = serial.tools.list_ports.comports()

#     for port in ports:
#         print(f"Checking port: {port.device}, {port.description}")
#         try:
#             # Attempt to open the port with a short timeout
#             ser = serial.Serial(port.device, 9600, timeout=1)
#             time.sleep(1)  # Wait briefly to ensure connection stabilizes

#             # Send a test command
#             ser.write(b'AT\r\n')
#             time.sleep(0.5)  # Give time for the device to respond

#             # Check if there's any response
#             if ser.in_waiting > 0:
#                 response = ser.read(ser.in_waiting).decode('utf-8').strip()
#                 if response:
#                     print(f"Found HC-05 on {port.device}")
#                     ser.close()
#                     return port.device

#             ser.close()

#         except (serial.SerialException, OSError) as e:
#             # Handle exceptions, print error, and continue
#             print(f"Failed to connect on {port.device}: {e}")
#             continue

#     return None  # Return None if no HC-05 was found

# def connect_to_hc05():
#     port = find_hc05()
#     if port is None:
#         print("HC-05 not found.")
#         return

#     # Connect to the found HC-05 port
#     try:
#         ser = serial.Serial(port, 9600, timeout=1)
#         print(f"Connected to HC-05 on {port}!")

#         # Send and receive data
#         ser.write(b'Hello from Python!\n')
#         time.sleep(1)
#         if ser.in_waiting > 0:
#             received_data = ser.read(ser.in_waiting).decode('utf-8').strip()
#             print(f"Received: {received_data}")

#         ser.close()

#     except (serial.SerialException, OSError) as e:
#         print(f"Failed to communicate with HC-05 on {port}: {e}")

# if __name__ == "__main__":
#     connect_to_hc05()

# scan for bluetooth devices

# import asyncio
# from bleak import BleakScanner

# async def main():
#     devices = await BleakScanner.discover()
#     for d in devices:
#         print(d)

# asyncio.run(main())

# import asyncio
# from bleak import BleakClient

# address = "98:B8:BC:37:0F:CD"
# MODEL_NBR_UUID = "2A24"

# async def main(address):
#     client = BleakClient(address)
#     try:
#         await client.connect()
#         model_number = await client.read_gatt_char(MODEL_NBR_UUID)
#         print("Model Number: {0}".format("".join(map(chr, model_number))))
#     except Exception as e:
#         print(e)
#     finally:
#         await client.disconnect()

# asyncio.run(main(address))

# import asyncio
# from bleak import BleakScanner, BleakClient

# async def find_device():
#     devices = await BleakScanner.discover()
#     for device in devices:
#         print(f"Device: {device.name}, Address: {device.address}")
#         return device.address  # Return the address of the first device found

# async def find_services(address):
#     async with BleakClient(address) as client:
#         # services = await client.get_services()
#         for service in client.services:
#             print(f"Service: {service.uuid}")
#             for char in service.characteristics:
#                 print(f"  Characteristic: {char.uuid}, Properties: {char.properties}")

# async def main():
#     address = await find_device()
#     await find_services(address)

# asyncio.run(main())