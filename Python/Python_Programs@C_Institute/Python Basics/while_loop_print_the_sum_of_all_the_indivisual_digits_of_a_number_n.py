num=int(input("Enter a number : "))

n=num 
# to save the original number to use it later while printing the message,
# we assign it to another variable which isn't modified
# otherwise, when the loop will terminate, n will be equal to 0

sum=0

while num!=0 :

	digit=num%10
	sum+=digit
	num=num//10

print("The Sum of all the indivisual digits of",n,"is :",sum)