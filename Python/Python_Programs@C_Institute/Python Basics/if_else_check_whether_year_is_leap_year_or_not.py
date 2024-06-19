year = int(input("Enter a year : "))

# if a year is a multiple of 400, or it is a multiple of 4, but not a multiple of 100. then it is a leap year

# 1600 is leap
# 1604 is leap
# 400 is leap
# 300 is not leap
# 2024 is leap
# 1900 is not leap

if year % 400 == 0 or (year % 4 == 0 and year % 100 != 0):

	print()
	print(year,"is a leap year")

else:

	print()
	print(year,"is not a leap year")