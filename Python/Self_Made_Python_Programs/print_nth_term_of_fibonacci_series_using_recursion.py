def fibonacci(n):

	if n <= 1 :
	
		return n

	return fibonacci(n-1) + fibonacci(n-2)

terms = int(input("Which term of the Fibonacci Series do you want to print ? : "))

print("The",terms,"th term of the Fibonacci Series is :",fibonacci(terms))