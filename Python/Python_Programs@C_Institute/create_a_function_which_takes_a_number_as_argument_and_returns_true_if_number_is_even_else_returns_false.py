def EvenOrOdd(num):
	if num%2==0:
		return True
	else:
		return False

num = int(input("Enter a number : "))

print("\n",EvenOrOdd(num))