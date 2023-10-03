# num = 12

num = int(input("Enter a number : "))

# one liner code, complex to understand

# result = "Divisible by 3 and 5" if num%3==0 and num%5==0 else "Divisible by 3" if num%3==0 else "Divisible by 5" if num%5==0 else "Not divisible by 3 or 5"

# Using backslash or '\' to break the nested if-else statement into multiple lines

result = "Divisible by 3 and 5" if num%3==0 and num%5==0 else\
		 "Divisible by 3" if num%3==0 else\
		 "Divisible by 5" if num%5==0 else\
		 "Not divisible by 3 or 5"

#leaving space(s) or writing comments in between nested if-else statements also leads to an error 

print(num,"is",result)