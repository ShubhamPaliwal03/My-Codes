import numpy as np

arr = np.array([	[	[	[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]	]	]	])

print(arr.ndim)

# 3rd element of 2nd row
print(arr[0][0][1][2])

# 4th element of 4th row
print(arr[0][0][3][3])