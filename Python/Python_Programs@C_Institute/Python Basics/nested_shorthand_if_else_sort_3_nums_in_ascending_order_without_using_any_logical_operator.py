a = int(input("Enter the first number  : "))
b = int(input("Enter the second number : "))
c = int(input("Enter the third number  : "))

if a>b :

	if a>c :

		if b>c :

			sorted_sequence = c,b,a

		else :

			sorted_sequence = b,c,a

	else :

		sorted_sequence = b,a,c

else :

	if b>c :

		if a>c :

			sorted_sequence = c,a,b

		else :

			sorted_sequence = a,c,b

	else :

		sorted_sequence = a,b,c

print(a,",",b,"and",c,"in sorted ascending order are : ",sorted_sequence)