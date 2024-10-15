# WAP to create	a function that prints the factorial of a positive integer using recursion.

def PrintFactorial(n):

	if n==0:

		return 1

	fact = n*PrintFactorial(n-1)

	return fact

num = int(input("Enter a positive integer : "))
print("\nThe Factorial of",num,"is :",PrintFactorial(num))