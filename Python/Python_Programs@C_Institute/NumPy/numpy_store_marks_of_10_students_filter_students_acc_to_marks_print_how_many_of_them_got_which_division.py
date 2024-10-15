# WAP to input percentage marks of 10 students, store them in a list, and create an array from the list, filter the students according to first division, second division, third division and fail

# >=60 		1st
# 48-60 	2nd
# 36-48 	3rd
# else 		Fail

# now print how many students got 1st divison, 2nd division and how many of them are fail.

import numpy as np

marks_list = []

i=1

while i<=10:

	per_marks = int(input("\nEnter the Percentage marks of "+str(i)+"th student : "))

	marks_list.append(per_marks)

	i+=1

array = np.array(marks_list)

condition1 = array>=60

condition2 = (array>=48) & (array<60)

condition3 = (array>=36) & (array<48)

conditionF = array<36

first_division = array[condition1]

second_division = array[condition2]

third_division = array[condition3]

fail = array[conditionF]

print("\nThe Number of Students having : ")

print("\nFirst Division :",len(first_division))

print("\nSecond Division :",len(second_division))

print("\nThird Division :",len(third_division))

print("\nFail :",len(fail))