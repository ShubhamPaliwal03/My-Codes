# WAP to create a function which takes a number n as an argument and prints counting from n to 1 using recursion.

def PrintCounting(n):
	if n==0:
		return

	print(n)
	PrintCounting(n-1)

num = int(input("Enter the number from which you want to start counting : "))
print()
PrintCounting(num)		