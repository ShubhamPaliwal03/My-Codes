num = int(input("Enter a number : "))

div_sum = 0
div = 1

while div<=num//2 :

	if num%div==0 :

		div_sum+=div

	div+=1

if div_sum==num :

	print(num,"is a Perfect number")

else :
	
	print(num,"is Not a Perfect number")	
