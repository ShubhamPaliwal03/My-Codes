string=input("Enter a string : ")

alphabets="abcdefghijklmnopqrstuvwxyz"

for x in alphabets:

	occurence=string.lower().count(x)

	print(x,"->",occurence)