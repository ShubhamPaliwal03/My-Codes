number = int(input("Enter a number : "))

#for doing the mod operation, which prevents negative values from entering the program and from disturbing the logic

num = number

if num<0 :
	num = -num

# Method-1

# result = "1 digit" if num<=9 else\
# 		 "2 digits" if num<=99 else\
# 		 "3 digits" if num<=999 else\
# 		 "more than 3 digits"

# Method-2

# result = "1 digit" if num<10 else\
# 		 "2 digits" if num<100 else\
# 		 "3 digits" if num<1000 else\
# 		 "more than 3 digits"

# Method-3

result = "1 digit" if num//10==0 else\
		 "2 digits" if num//100==0 else\
		 "3 digits" if num//1000==0 else\
		 "more than 3 digits"		 

print(number,"is a number having",result)
