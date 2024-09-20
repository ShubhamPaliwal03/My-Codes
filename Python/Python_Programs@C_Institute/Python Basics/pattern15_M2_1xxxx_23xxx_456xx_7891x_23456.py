i=1
k=1
while i<=5:
	j=1
	while j<=i:
		print(k,end="")
		j+=1
		k+=1
		if k==10:
			k=1
	while j<=5:
		print("*",end="")
		j+=1
	print()
	i+=1	