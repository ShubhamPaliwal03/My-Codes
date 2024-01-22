num = int(input("Enter a number : "))

i=2

while i<=num//2:

	if num%i==0:

		if (i*i)==num:

			print("The Perfect Square Root of",num,"is :",i)
			break

	i+=1

# print(i)

if i>num//2:

	print("The Perfect Square Root of",num,"Does Not Exist!")