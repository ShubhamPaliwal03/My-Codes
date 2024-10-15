# A year is a leap year if the following conditions are satisfied:

# 1. The year is multiple of 400.

#or

# 2. The year is multiple of 4 and not multiple of 100.

# year = 2024

year = int(input("Enter a year in yyyy format : "))

# is_leap_year = "A leap year" if year %4 == 0 and (year % 100 != 0 or year % 400 == 0) else "Not a leap year"

is_leap_year = "A leap year" if year % 400 == 0 or (year % 4 == 0 and year % 100 != 0) else "Not a leap year"

print(is_leap_year)