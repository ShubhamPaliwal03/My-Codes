def checkForPerfectNum(n):

# logic to find the divisors of the number starting from 1, excluding the number itself, 
# and adding them together to calculate the sum, and at the end, checking if the sum of its divisors is equal to 
# the numbers, if yes, then the no. is perfect, else, not perfect. 

	sum=0
	i=1

	while i<num//2:

		if num%i==0:

			sum+=i

		i+=1
		
	if sum==num:

		return True

	else:

		return False

num = int(input("Enter a number : "))

print("\n",checkForPerfectNum(num))