# WAP to create a function that takes a number n as an argument and prints counting from 1 to n using recursion.

def PrintCounting(n):
	if n==0:
		return

	PrintCounting(n-1)
	print(n)

num = int(input("Enter the number upto which you want to print counting : "))
print()
PrintCounting(num)		
