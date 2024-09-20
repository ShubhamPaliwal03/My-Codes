import serial
import time

def connect_to_hc05(port):
    try:
        # Open the serial port for Bluetooth communication
        ser = serial.Serial(port, 9600, timeout=1)
        print(f"Connected to HC-05 on {port}!")

        # Send data to the HC-05 only once
        ser.write(b'Hello from Python!\n')
        print("Sent: Hello from Python!")

        # Wait to receive the response
        time.sleep(2)

        # Check for incoming data
        if ser.in_waiting > 0:
            received_data = ser.read(ser.in_waiting).decode('utf-8').strip()
            print(f"Received: {received_data}")
        else:
            print("No data received.")

    except (serial.SerialException, OSError) as e:
        print(f"Failed to communicate with HC-05 on {port}: {e}")

    finally:
        # Close the port
        if ser.is_open:
            ser.close()
        print("Serial port closed.")

if __name__ == "__main__":
    bt_port = 'COM4'  # Replace with the correct port for your Bluetooth module
    connect_to_hc05(bt_port)