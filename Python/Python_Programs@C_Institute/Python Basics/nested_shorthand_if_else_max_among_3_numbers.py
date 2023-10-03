a = int(input("Enter first number  : "))
b = int(input("\nEnter second number : "))
c = int(input("\nEnter third number  : "))


max = a if a>b and a>c else b if b>c else c

print("Maximum number among",a,",",b,"and",c,"is : ",max)