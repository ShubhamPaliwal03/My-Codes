import numpy as np

n = int(input("\nEnter the size of the numpy array you want to create : "))

array_list = []

for x in range(1,n+1):

	val = int(input("\nEnter the " +str(x)+"th element into the array : "))

	array_list.append(val)

nparr = np.array(array_list)

print("\nThe numpy array is as follows :\n\n",nparr)