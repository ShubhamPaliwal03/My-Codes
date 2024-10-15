num=int(input("Enter a number : "))

n=num

r=0

while num!=0 :

	m = num%10
	r = r * 10 + m
	num = num // 10

print("The Reverse of",n,"is :",r)	