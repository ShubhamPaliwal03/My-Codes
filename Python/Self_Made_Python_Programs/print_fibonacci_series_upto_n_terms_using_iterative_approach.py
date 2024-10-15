terms = int(input("Upto how many terms you want to print the Fibonacci Series : "))

count = 0

fib1 = 0
fib2 = 1

print("The Fibonacci Series Upto",terms,"terms is :\n")

if terms>=1:

	print(fib1,end=" ")

if terms>=2:	

	print(fib2,end=" ")

while count!=terms-2:

	Sum = fib1 + fib2
	fib1 = fib2
	fib2 = Sum

	print(Sum,end=" ")

	count+=1