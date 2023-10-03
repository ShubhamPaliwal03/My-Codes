# using while loop and ascii codes, with chr() function

i=65
while i<=69:
	j=65
	while j<=i:
		print(chr(j),end="")
		j+=1
	print()
	i+=1