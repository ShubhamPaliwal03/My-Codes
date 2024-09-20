n=int(input("Enter a number : "))
n+=1 # because we have to print numbers after n
con=1
while con==1:
	j=2
	divCount=0
	while j<=n//2:
		if n%j==0:
			divCount+=1
			break
		j+=1	
	if divCount==0:
		break
	print(n,end=" ")
	n+=1	
				