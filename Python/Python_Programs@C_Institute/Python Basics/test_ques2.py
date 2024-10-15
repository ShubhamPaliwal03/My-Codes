# Q2. WAP to input an integer and print factorial of integer using for loop.

num = int(input("\nEnter a number : "))

fact = 1

for x in range(1, num+1) :

	fact *= x

print("\nThe Factorial of",num,"is :",fact)