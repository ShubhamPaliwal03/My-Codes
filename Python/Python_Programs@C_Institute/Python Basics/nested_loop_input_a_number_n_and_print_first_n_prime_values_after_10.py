n=int(input("How many prime values do you want to print after 10 : "))
num=11 # because we have to print n prime values after 10
count=0
while count!=n: # the condition can also be : while count<n:
	divCount=0
	j=2
	while j<=num//2:
		if num%j==0:
			divCount+=1
			break	
		j+=1
	if divCount==0:	
		print(num,end=" ")
		count+=1
	num+=1	