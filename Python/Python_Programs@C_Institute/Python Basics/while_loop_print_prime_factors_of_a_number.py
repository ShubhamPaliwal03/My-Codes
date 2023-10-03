n = int(input("Enter a number : "))

factor = 2

print("\nThe Prime Factors of",n,"are :",end=" ")

while n != 1: # we can also set the condition as n > 1

	if n % factor == 0:

		print(factor,end=" ")

		n = n // factor

	else:
	
		factor += 1