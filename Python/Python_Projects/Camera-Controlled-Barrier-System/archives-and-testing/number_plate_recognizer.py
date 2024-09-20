import cv2
import os
import easyocr
import serial
import time
import pandas as pd
import datetime
# import matplotlib.pyplot as plt
# import numpy as np
# import pytesseract

def logDataIntoRecords(entry_data):

    date, time, v_num, v_type, v_model, v_owner_name = entry_data

    try:

        # load the existing Excel file

        records_data_frame = pd.read_excel("./records/vehicle_entry_data.xlsx", sheet_name="Sheet1")

        # Create a new row as a DataFrame

        new_record_dataframe = pd.DataFrame({

                'Date' : [date],
                'Time' : [time],
                'Vehicle Number' : [v_num],
                'Vehicle Type' : [v_type],
                'Vehicle Model' : [v_model],
                'Vehicle Owner Name' : [v_owner_name]
        });

        # append the new row to the existing dataframe

        records_data_frame = pd.concat([records_data_frame, new_record_dataframe], ignore_index=True)

        # save the uploaded data frame back to the excel file

        records_data_frame.to_excel('./records/vehicle_entry_data.xlsx', sheet_name="Sheet1", index=False)

        print(f"Data Entry of vehicle {v_num} successfully done in the vehicle entry records...")

    except (FileNotFoundError) as e:
            
            print(f"Vehicle Entry Data Excel Workbook File Not Found! {e}")
            print("Creating an Empty Excel Workbook for Storing Vehicle Entry Records...You can view the records in the following file : 'vehicle_entry_data.xlsx'")

            # create an empty excel file with the expected columns

            empty_dataframe = pd.DataFrame(columns=["Date", "Time", "Vehicle Number", "Vehicle Type", "Vehicle Model", "Vehicle Owner Name"])
            empty_dataframe.to_excel("./records/vehicle_entry_data.xlsx", index=False)

            print(f"Data Entry of vehicle {v_num} not done in the vehicle entry records!")

    except (Exception) as e:
    
        print(e)

        print(f"Data Entry of vehicle {v_num} not done in the vehicle entry records!")

def extractAuthorizedVehiclesData():

    vehicle_data = dict()

    try:

        records_data_frame = pd.read_excel('./records/authorized_vehicles_data.xlsx', sheet_name="Sheet1")

        for i, row in records_data_frame.iterrows():

            v_num = row["Vehicle Number"]
            v_type = row["Vehicle Type"]
            v_model = row["Vehicle Model"]
            v_owner_name = row["Vehicle Owner Name"]

            vehicle_data[v_num] = (v_type, v_model, v_owner_name)

        return vehicle_data

    except (FileNotFoundError) as e:
            
            print(f"Authorized Vehicles Data Excel Workbook File Not Found! {e}")
            print("Creating an Empty Excel Workbook for Storing Authorized Vehicles Data Records...Please Enter Your Records in the following file : 'authorized_vehicles_data.xlsx'")

            # create an empty excel file with the expected columns

            empty_dataframe = pd.DataFrame(columns=["Vehicle Number", "Vehicle Type", "Vehicle Model", "Vehicle Owner Name"])
            empty_dataframe.to_excel("./records/authorized_vehicles_data.xlsx", index=False)

            return None

    except (Exception) as e:
    
        print(e)

        return None

def isRegisteredVehicle(vehicleNumber):

    return vehicleNumber in authorized_vehicles_data

def getPlateNumberOCR(img):

    gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

    gray = cv2.cvtColor(gray, cv2.COLOR_BGR2RGB)

    # plt.imshow(gray)

    # plt.show()

    result = reader.readtext(gray)

    if result:

        return result[0][1].upper()

    return "NOT FOUND"

def connect_to_hc05(incoming_port, outgoing_port):

    try:

        # Open the incoming (read) port

        ser_in = serial.Serial(incoming_port, 9600, timeout=1)

        # Open the outgoing (write) port

        ser_out = serial.Serial(outgoing_port, 9600, timeout=1)

        print(f"Connected to HC-05 on {incoming_port} (incoming) and {outgoing_port} (outgoing)!")

        # Send data to the HC-05 only once

        ser_out.write(b'200')
        print("Sent: 200")

        # Wait to receive the response

        time.sleep(2)

        # Check for incoming data

        if ser_in.in_waiting > 0:

            received_data = ser_in.read(ser_in.in_waiting).decode('utf-8').strip()
            print(f"Received: {received_data}")

            if received_data == "200":

                return True
        else:

            print("No data received from Arduino (HC-05)!")

            return False

    except (serial.SerialException, OSError) as e:

        print(f"Failed to communicate with HC-05 on {incoming_port}/{outgoing_port}: {e}")

        return False

# def connect_to_hc05(port):

#     try:

#         # Open the serial port for Bluetooth communication
#         ser = serial.Serial(port, 9600, timeout=1)
#         print(f"Connected to HC-05 on {port}!")

#         # Send data to the HC-05 only once
#         ser.write(b'200\n')
#         print("Sent: 200")

#         # Wait to receive the response
#         time.sleep(2)

#         # Check for incoming data
#         if ser.in_waiting > 0:

#             received_data = ser.read(ser.in_waiting).decode('utf-8').strip()

#             print(f"Received: {received_data}")

#             if received_data == "200":

#                 return True

#         else:

#             print("No data received from Arduino (HC-05)!")

#             return False

#     except (serial.SerialException, OSError) as e:

#         print(f"Failed to communicate with HC-05 on {port}: {e}")

#         return False

def sendDataToArduino():

    try:

        if ser_out is not None:

            ser_out.write(b'A')
            print('Sent: A')

        else:

            print('Serial Port Not Opened!')

    except (Exception) as e:

        print("Failed to send authentication success message to Arduino"+e)

def closeIOPorts():

    if ser_in is not None and ser_in.is_open:

        ser_in.close()
        print("Incoming serial port closed...")

    if ser_out is not None and ser_out.is_open:

        ser_out.close()
        print("Outgoing serial port closed...")

if __name__ == "__main__":

    # Load all the authorized number plates from the excel .csv file, into a hash map (python's dictionary) for faster search
    # Format :- (Vehicle Number : (Vehicle Type, Vehicle Owner Name))

    authorized_vehicles_data = extractAuthorizedVehiclesData()

    # print(authorized_vehicles_data)

    if authorized_vehicles_data is None or len(authorized_vehicles_data) == 0:

        print("No Records Found in 'authorized_vehicles_data.csv'...Please Add Records and Restart the Program...")

        exit()

    isMatched = False

    # connect to HC05 bluetooth module (receiver)

    bt_port_incoming = 'COM4' # Replace with the correct incoming port for your Bluetooth module
    bt_port_outgoing = 'COM5' # Replace with the correct ouotgoing port for your Bluetooth module

    ser_in = None
    ser_out = None

    if not connect_to_hc05(bt_port_incoming, bt_port_outgoing):

        print("Handshake with Arduino (HC-05) Unsuccessful!")

        print("Couldn't connect to Arduino...Exiting from the program...")

        exit()

    else:

        print("Handshake with Arduino (HC-05) Successful....Communication Initiated...")

    harcascade = "model/haarcascade_russian_plate_number.xml"

    # Initialize video capture

    cap = cv2.VideoCapture(0)
    cap.set(3, 640)  # width
    cap.set(4, 480)  # height

    min_area = 500
    count = 0

    # load Haar Cascade and EasyOCR Reader once

    plate_cascade = cv2.CascadeClassifier(harcascade)
    reader = easyocr.Reader(['en'])    

    while True:

        success, img = cap.read()
        img_gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
        plates = plate_cascade.detectMultiScale(img_gray, 1.1, 4)

        img_roi = None

        for (x, y, w, h) in plates:

            area = w * h

            if area > min_area:

                cv2.rectangle(img, (x, y), (x + w, y + h), (0, 255, 0), 2)
                cv2.putText(img, "Number Plate", (x, y - 5), cv2.FONT_HERSHEY_COMPLEX_SMALL, 1, (255, 0, 255), 2)

                img_roi = img[y: y + h, x: x + w]

                cv2.imshow("ROI", img_roi)

                # Perform OCR directly on the ROI without saving and loading the image

                plate_number = getPlateNumberOCR(img_roi)
                print(plate_number)

                if len(plate_number) == 10 and plate_number != "NOT FOUND":

                    if isRegisteredVehicle(plate_number):

                        print(f"Entry Permission Granted...Welcome, {plate_number}")
                        isMatched = True

                    else:

                        print("Number Plate Not Found in Record! Entry Permission Restricted!")
                        isMatched = False

                else:

                    print("Number Plate Not Found! Rescanning...")
                    isMatched = False

                cv2.rectangle(img, (0, 200), (640, 300), (0, 255, 0), cv2.FILLED)
                cv2.putText(img, f"Number Plate : {plate_number}", (150, 265), cv2.FONT_HERSHEY_COMPLEX_SMALL, 1, (0, 0, 255), 1)
                cv2.imshow("Results", img)

                # if number plate is authorized

                if isMatched:

                    cv2.waitKey(5000)  # wait for 5 seconds for the car to pass
                    isMatched = False
                    img_roi = None  # reset the ROI for the next scan

                    # send the data to arduino (1 as a binary string, representing authorized access)

                    sendDataToArduino()

                    # obtain the entry data by extracting the vehicle data from the plate number, and combining it with the date and timestamp

                    permitted_vehicle_data = authorized_vehicles_data[plate_number] # a tuple containing v_type, v_model_v_owner_name

                    v_num = plate_number

                    v_type, v_model, v_owner_name = permitted_vehicle_data # tuple unpacking

                    # v_type = permitted_vehicle_data[0]
                    # v_model = permitted_vehicle_data[1]
                    # v_owner_name = permitted_vehicle_data[2]

                    date = datetime.date.today()

                    time = datetime.datetime.now().strftime("%I:%M:%S %p")

                    entry_data = (date, time, v_num, v_type, v_model, v_owner_name)

                    # log the entry data into the sheet of excel the workbook containing all the vehicle entry records

                    logDataIntoRecords(entry_data)

                else:

                    cv2.waitKey(1000)  # wait for 1 second before the next scan

        if cv2.waitKey(1) & 0xFF == ord('q'):

            break

    cap.release()
    cv2.destroyAllWindows()

    # Close the port

    closeIOPorts()