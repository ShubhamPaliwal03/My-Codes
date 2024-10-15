n = int(input("How many values do you want to add into the list : "))

alist = []

# print("\nEnter the",n,"values into the list (next line seperated) :\n")

for x in range(1,n+1) :

	num = int(input("\nEnter the "+str(x)+"th value into the list : "))

	num = int(input())

	alist.append(num)

odd_values = [x for x in alist if x % 2 == 1]

even_values = [x for x in alist if x % 2 == 0]

print("\nThe list containing odd values is :",odd_values)

print("\nThe list containing even values is :",even_values)