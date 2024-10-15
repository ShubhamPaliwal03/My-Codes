#################################################### V3 (Using Tesseract), Not Accurate

# import cv2
# import numpy as np
# import pytesseract

# harcascade = "model/haarcascade_russian_plate_number.xml"

# # Initialize video capture
# cap = cv2.VideoCapture(0)
# cap.set(3, 640)  # width
# cap.set(4, 480)  # height

# min_area = 500
# count = 0

# # Load Haar Cascade
# plate_cascade = cv2.CascadeClassifier(harcascade)

# def isRegisteredVehicle(vehicleNumber):
#     return True

# def preprocess_image_for_ocr(img):
#     # Convert the image to grayscale
#     gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

#     # Apply a bilateral filter to reduce noise while preserving edges
#     gray = cv2.bilateralFilter(gray, 11, 17, 17)

#     # Apply adaptive thresholding to get a binary image
#     thresh = cv2.adaptiveThreshold(gray, 255, cv2.ADAPTIVE_THRESH_GAUSSIAN_C,
#                                    cv2.THRESH_BINARY, 11, 2)

#     # Apply morphological operations to enhance the text regions
#     kernel = np.ones((3, 3), np.uint8)
#     morph = cv2.morphologyEx(thresh, cv2.MORPH_CLOSE, kernel)

#     # Optional: invert the image (sometimes needed for better OCR results)
#     morph = cv2.bitwise_not(morph)

#     return morph    

# def perform_ocr(img):
#     # Perform OCR using Tesseract
#     text = pytesseract.image_to_string(img, lang='eng', config='--psm 6')

#     # Check if Tesseract returned any text
#     if text.strip():
#         return text.strip().upper()
#     else:
#         return "NOT FOUND"

# def getPlateNumberOCR(img_roi):
#     preprocessed_image = preprocess_image_for_ocr(img_roi)
#     ocr_result = perform_ocr(preprocessed_image)
#     return ocr_result

# isMatched = False

# while True:
#     success, img = cap.read()
#     img_gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
#     plates = plate_cascade.detectMultiScale(img_gray, 1.1, 4)

#     img_roi = None

#     for (x, y, w, h) in plates:
#         area = w * h

#         if area > min_area:
#             cv2.rectangle(img, (x, y), (x + w, y + h), (0, 255, 0), 2)
#             cv2.putText(img, "Number Plate", (x, y - 5), cv2.FONT_HERSHEY_COMPLEX_SMALL, 1, (255, 0, 255), 2)

#             img_roi = img[y: y + h, x: x + w]
#             cv2.imshow("ROI", img_roi)

#             # Perform OCR directly on the ROI without saving and loading the image
#             plate_number = getPlateNumberOCR(img_roi)
#             print(plate_number)

#             if len(plate_number) == 10 and plate_number != "NOT FOUND":
#                 if isRegisteredVehicle(plate_number):
#                     print(f"Welcome, {plate_number}")
#                     isMatched = True
#                 else:
#                     print("Number Plate Not Found in Record! Entry Permission Restricted!")
#                     isMatched = False
#             else:
#                 print("Number Plate Not Found! Rescanning...")
#                 isMatched = False

#             cv2.rectangle(img, (0, 200), (640, 300), (0, 255, 0), cv2.FILLED)
#             cv2.putText(img, f"Number Plate : {plate_number}", (150, 265), cv2.FONT_HERSHEY_COMPLEX_SMALL, 1, (0, 0, 255), 1)
#             cv2.imshow("Results", img)

#             if isMatched:
#                 cv2.waitKey(5000)  # wait for 5 seconds for the car to pass
#                 isMatched = False
#                 img_roi = None  # reset the ROI for the next scan
#             else:
#                 cv2.waitKey(1000)  # wait for 1 second before the next scan

#     if cv2.waitKey(1) & 0xFF == ord('q'):
#         break

# cap.release()
# cv2.destroyAllWindows()

#################################################### V2

# import cv2
# import os
# import easyocr
# import matplotlib.pyplot as plt
# import numpy as np
# import pytesseract

# harcascade = "model/haarcascade_russian_plate_number.xml"

# # Initialize video capture

# cap = cv2.VideoCapture(0)
# cap.set(3, 640)  # width
# cap.set(4, 480)  # height

# min_area = 500
# count = 0

# # Load Haar Cascade and EasyOCR Reader once

# plate_cascade = cv2.CascadeClassifier(harcascade)
# reader = easyocr.Reader(['en'])

# def isRegisteredVehicle(vehicleNumber):

#     return True

# def getPlateNumberOCR(img):

#     gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

#     gray = cv2.cvtColor(gray, cv2.COLOR_BGR2RGB)

#     # plt.imshow(gray)

#     # plt.show()

#     result = reader.readtext(gray)

#     if result:

#         return result[0][1].upper()

#     return "NOT FOUND"   

# isMatched = False

# while True:

#     success, img = cap.read()
#     img_gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
#     plates = plate_cascade.detectMultiScale(img_gray, 1.1, 4)

#     img_roi = None

#     for (x, y, w, h) in plates:

#         area = w * h

#         if area > min_area:

#             cv2.rectangle(img, (x, y), (x + w, y + h), (0, 255, 0), 2)
#             cv2.putText(img, "Number Plate", (x, y - 5), cv2.FONT_HERSHEY_COMPLEX_SMALL, 1, (255, 0, 255), 2)

#             img_roi = img[y: y + h, x: x + w]

#             cv2.imshow("ROI", img_roi)

#             # Perform OCR directly on the ROI without saving and loading the image

#             plate_number = getPlateNumberOCR(img_roi)
#             print(plate_number)

#             if len(plate_number) == 10 and plate_number != "NOT FOUND":

#                 if isRegisteredVehicle(plate_number):

#                     print(f"Welcome, {plate_number}")
#                     isMatched = True

#                 else:

#                     print("Number Plate Not Found in Record! Entry Permission Restricted!")
#                     isMatched = False

#             else:

#                 print("Number Plate Not Found! Rescanning...")
#                 isMatched = False

#             cv2.rectangle(img, (0, 200), (640, 300), (0, 255, 0), cv2.FILLED)
#             cv2.putText(img, f"Number Plate : {plate_number}", (150, 265), cv2.FONT_HERSHEY_COMPLEX_SMALL, 1, (0, 0, 255), 1)
#             cv2.imshow("Results", img)

#             if isMatched:

#                 cv2.waitKey(5000)  # wait for 5 seconds for the car to pass
#                 isMatched = False
#                 img_roi = None  # reset the ROI for the next scan

#             else:

#                 cv2.waitKey(1000)  # wait for 1 second before the next scan

#     if cv2.waitKey(1) & 0xFF == ord('q'):

#         break

# cap.release()
# cv2.destroyAllWindows()

###################################### V1

# import cv2
# import os
# import matplotlib.pyplot as plt
# import numpy as np
# import imutils 
# import easyocr

# harcascade = "model/haarcascade_russian_plate_number.xml"

# cap = cv2.VideoCapture(0)

# cap.set(3, 640) # width
# cap.set(4, 480) #height

# min_area = 500
# count = 0

# output_dir = os.path.join(os.path.expanduser('~'), r'Desktop\Project\Car-Number-Plates-Detection\plates')

# if not os.path.exists(output_dir):

#     os.makedirs(output_dir)

# def isRegisteredVehicle(vehicleNumber):

#     return True

# def getPlateNumberOCR(img_path):

#     img = cv2.imread(img_path)

#     if img is None:

#         return "NOT FOUND"

#     gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

#     gray = cv2.cvtColor(gray, cv2.COLOR_BGR2RGB)

#     # plt.imshow(gray)

#     # plt.show()

#     reader = easyocr.Reader(['en'])

#     result = reader.readtext(gray)

#     # print(result)

#     if result:

#         return result[0][1].upper()

#     return "NOT FOUND"

# def save_image(file_path, img):

#     if img is not None and img.size > 0:

#         if not cv2.imwrite(file_path, img):

#             raise Exception("Could not write image")

#         else:
#             print("Image saved successfully...")
#     else:

#         print("Image is empty or not valid!")

# isMatched = False

# while True:

#     success, img = cap.read()

#     plate_cascade = cv2.CascadeClassifier(harcascade)
#     img_gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

#     plates = plate_cascade.detectMultiScale(img_gray, 1.1, 4)

#     img_roi = None

#     for (x,y,w,h) in plates:

#         area = w * h

#         if area > min_area:

#             cv2.rectangle(img, (x,y), (x+w, y+h), (0,255,0), 2)
#             cv2.putText(img, "Number Plate", (x,y-5), cv2.FONT_HERSHEY_COMPLEX_SMALL, 1, (255, 0, 255), 2)

#             img_roi = img[y: y+h, x:x+w]
#             cv2.imshow("ROI", img_roi)

#     cv2.imshow("Result", img)

#     file_path = os.path.join(output_dir, f'scanned_img.jpg')

#     # if cv2.waitKey(1) & 0xFF == ord('s'):

#     if cv2.waitKey(1) and 'img_roi' in locals():

#         # print(f"Saving image to: {file_path}")
#         # print(f"Image shape: {img_roi.shape}, dtype: {img_roi.dtype}")

#         save_image(file_path, img_roi)

#         plate_number = getPlateNumberOCR(file_path);

#         print(plate_number)

#         if len(plate_number) == 10 and plate_number != "NOT FOUND":

#             if (isRegisteredVehicle(plate_number)):

#                 print(f"Welcome, {plate_number}")

#                 isMatched = True

#             else:

#                 print("Number Plate Not Found in Record! Entry Permission Restricted!")

#                 isMatched = False

#         else:
        
#             print("Number Plate Not Found! Rescanning...")

#             isMatched = False

#         cv2.rectangle(img, (0,200), (640,300), (0,255,0), cv2.FILLED)
#         cv2.putText(img, f"Number Plate : {plate_number}", (150, 265), cv2.FONT_HERSHEY_COMPLEX_SMALL, 1, (0, 0, 255), 1)
#         cv2.imshow("Results",img)

#         if isMatched:

#             cv2.waitKey(10000) # wait for 10 seconds for the car to pass

#             isMatched = False

#             # reset the img_roi to none

#             img_roi = None

#             # Delete the temporary image file

#             os.remove(file_path)

#         else:
            
#             cv2.waitKey(5000) # wait for 1 second, before the next scan

#         count += 1