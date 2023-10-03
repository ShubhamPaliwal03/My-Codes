i=1
while i<=6:
	j=1
	while j<=5:
		if i<=j:
			print("*",end="")
		else:
			print(j,end="")
		j+=1
	print()
	i+=1