def PrimeFactors():

	n = int(input("Enter a number : "))

	print("\nThe Prime Factors of",n,"are : ",end="")

	i=2
	while n>1:

		if n%i==0:
			n = n // i
			print(i,end=" ")
		else:
			i+=1

PrimeFactors()	