n=int(input("How many prime values do you want to print before 1000 : "))
count=0
num=999 # because we have to print n prime values before 1000
while count!=n and num>=2: # Since 0 and all negative numbers are neither prime nor composite and 1 is composite (non-prime)
	i=2
	divCount=0
	while i<=num//2:
		if num%i==0:
			divCount+=1
			break
		i+=1
	if divCount==0:
		print(num,end=" ")
		count+=1
	num-=1