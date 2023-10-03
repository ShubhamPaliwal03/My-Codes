# using for loop and ASCII codes, with chr() function

rows = "abcde" # or 12345, or any other 5 character  (to print upto e)
columns = "abcde" # or 12345, or any other 5 character string (to print upto e)

i=65 # 65-69 are the ASCII values for A-E
for x in rows:
	j=65
	for y in columns:
		if j<=i:
			print(chr(j),end="") 
		j+=1
	print()
	i+=1

# chr() is an inbuilt function present in Python which converts the ASCII value stored in integer to character constant

# we can also use a single string containing 5 characters to iterate over, in both the for loops (as a sequence) in this particular case