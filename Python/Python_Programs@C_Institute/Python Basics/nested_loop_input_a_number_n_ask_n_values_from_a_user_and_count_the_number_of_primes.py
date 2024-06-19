n=int(input("How many values do you want to check : "))
count=0	
i=1
while i<=n:
	num=int(input("Enter a value : "))
	divCount=0
	j=2
	while j<=num//2:
		if num%j==0:
			divCount+=1
			break
		j+=1
	if divCount==0:
		count+=1
	i+=1
print("Total number of primes are :",count)