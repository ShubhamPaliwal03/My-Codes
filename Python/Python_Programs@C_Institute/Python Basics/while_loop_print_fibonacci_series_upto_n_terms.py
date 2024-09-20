n=int(input("Upto how many terms you want to print the Fibonacci series : "))

fib1=0
fib2=1
sum=0

print("\nThe Fibonacci series upto",n,"terms is :",end=" ")

print(fib1,end=" ")
print(fib2,end=" ")

count=2

while count<n : #Alternatively, you can set count=0 and set the condition as count<n-2, or set count=2 and set the condition as count!=n

	sum=fib1+fib2

	print(sum,end=" ")

	fib1=fib2

	fib2=sum

	count+=1