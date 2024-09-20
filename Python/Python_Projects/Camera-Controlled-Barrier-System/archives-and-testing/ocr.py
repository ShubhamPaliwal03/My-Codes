import cv2
import matplotlib.pyplot as plt
import numpy as np
import imutils 
import easyocr

img = cv2.imread('./plates/scanned_img_0.jpg')

gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

gray = cv2.cvtColor(gray, cv2.COLOR_BGR2RGB)

# plt.imshow(gray)

# plt.show()

reader = easyocr.Reader(['en'])

result = reader.readtext(gray)

# print(result)

print(result[0][1].upper())

plt.show()

# import cv2
# import easyocr
# from IPython.display import Image

# Image("./plates/scanned_img_0.jpg")

# reader = easyocr.Reader(['en'])

# output = reader.readtext('./plates/scanned_img_0.jpg')

# print(output[0][1].upper())