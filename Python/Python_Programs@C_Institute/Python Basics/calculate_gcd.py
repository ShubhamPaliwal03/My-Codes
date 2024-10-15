# function to calculate GCD, Time Complexity :- O(log(min(a, b)))

def getGCD(a, b):

	if b == 0:

		return a

	return getGCD(b, a % b)

# Input the values

a = int(input('Enter a : '))
b = int(input('Enter b : '))

# calculate the GCD and print it
	
print('The GCD of',a,'and',b,'is :',getGCD(a, b))