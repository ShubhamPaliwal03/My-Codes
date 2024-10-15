def PrintMax(*num):

	# Method-1 ->

		# maximum = -2147483648

		# for val in num:

		# 	maximum = val if val>maximum else maximum

		# return maximum

	# Method-2 ->

		return max(num)

print(PrintMax(10,20,30,40,5,6))#40

print(PrintMax(10,20))#20

print(PrintMax(100,200,300,50))#300

print(PrintMax(100))#100

print(PrintMax(-200,-300,0,100,-50))#100

print(PrintMax()) 
# Using M-1 :- ValueError: max() arg is an empty sequence
# Using M-2 :- -2147483648
