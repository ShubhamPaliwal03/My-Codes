def Reverse():
	num = n = int(input("Enter a number : "))
	r=0
	while num > 0 :

		m = num % 10
		r = r * 10 + m
		num = num // 10

	print("\nThe Reverse of",n," is : ",r)

Reverse()