i=1
k=1
while i<=5:
	j=1
	while j<=5:
		if j<=i:
			print(k,end="")
			k+=1
			if k==10:
				k=1
		else:
			print("*",end="")
		j+=1
	print()	
	i+=1