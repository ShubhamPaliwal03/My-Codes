age = int(input("Enter the age of the person (male/female) : "))

gender = input("Enter the gender of the person : ").lower()

# M-1

# if gender == "male" :

# 	if age >= 21:

# 		print("He can marry...")

# 	else:

# 		print("He cannot marry!")

# else:

# 	if age >= 18:

# 		print("She can marry...")

# 	else:

# 		print("She cannot marry!")

# M-2

if gender == "male" and age >= 21 or gender == "female" and age >= 18:

	print("The person can marry...")

else:

	print("The person cannot marry!")