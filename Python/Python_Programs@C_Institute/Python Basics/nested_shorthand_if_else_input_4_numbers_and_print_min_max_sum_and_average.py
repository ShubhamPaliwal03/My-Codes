a = int(input("Enter first number : "))
b = int(input("Enter second number : "))
c = int(input("Enter third number : "))
d = int(input("Enter fourth number : "))

max = a if a>b and a>c and a>d else b if b>c and b>d else c if c>d else d

min = a if a<b and a<c and a<d else b if b<c and b<d else c if c<d else d

sum = a+b+c+d

average = sum/4

print("Maximum number among",a,",",b,",",c,"and",d,"is :",max)
print("Minimum number among",a,",",b,",",c,"and",d,"is :",min)
print("Sum of",a,",",b,",",c,"and",d,"is :",sum)
print("Average of",a,",",b,",",c,"and",d,"is :",average)