def AddPrimesIntoList(num):

	list_of_prime_factors=[]

	i=2
	while num>1:

		if num%i==0:
			num //= i
			list_of_prime_factors.append(i)
		else:
			i+=1

	return list_of_prime_factors
	
n = int(input("Enter a number : "))

print("The Prime Factors of",n,"are :",AddPrimesIntoList(n))

# p = AddPrimesIntoList(n)

# print("The Prime Factors of",n,"are :",p)
