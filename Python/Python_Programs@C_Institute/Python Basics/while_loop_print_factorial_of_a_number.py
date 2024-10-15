num = int(input("Enter a number : "))

n = num

fact = 1

while n != 1: # we can also set the condition n > 1 here

	fact = fact * n

	n -= 1

print("\nThe Factorial of",num,"is :",fact)