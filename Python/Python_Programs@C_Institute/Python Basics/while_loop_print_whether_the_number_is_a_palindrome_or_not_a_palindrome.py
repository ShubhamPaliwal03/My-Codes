num=int(input("Enter a number : "))

n=num
# to save the original number to use it later while checking the condition of palindrome,
# we assign it to another variable which isn't modified
# otherwise,when the loop will terminate,n will be equal to 0 and the result will always be : number is not a palindrome

r=0

while num!=0 :

	m=num%10
	r=r*10+m
	num=num//10

if r==n :

	print(n,"is a Palindrome")

else :

	print(n,"is Not a Palindrome")	