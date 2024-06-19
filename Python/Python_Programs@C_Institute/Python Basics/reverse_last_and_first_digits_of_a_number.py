num=int(input("Enter a number : "))
count=0
while num!=0:
    count+=1
    dig=num%10
    if count==1:
        last=dig
    num=num*10+dig
    num=num/10
first=dig
number=last*(10**count)
num=num/10
while count>=1:
    count-=1
    dig=num%10
    number+=dig*(10**count)
    num=num/10
number+=first*(10**count)

print("The Reverse is :",number)