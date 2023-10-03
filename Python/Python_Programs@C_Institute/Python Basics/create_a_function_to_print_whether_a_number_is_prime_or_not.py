def CheckPrime():
	num = int(input("Enter a number : "))

	i=2
	while i*i<=num:

		if num%i==0:
			break
		i+=1

	if i*i>num:
		print(num,"is a Prime Number")
	else:
		print(num,"is Not a Prime Number")

CheckPrime()					