import numpy as np

arr = np.array([1,2,3,4,5])
print(arr)
print(type(arr))

arr = np.array((1,2,3,4,5))
print(arr)
print(type(arr))

# Create a 0-D array with value 50

# 0-D Array or Scalar
arr = np.array(50)
print(arr)

# 1-D Array
arr = np.array([10,20,30,40,50])
print(arr)

# 2-D Array
arr = np.array([[10,20,30],[40,50,60]])
print(arr)

# 3-D Array
arr = np.array([[[10,20,30],[40,50,60]],[[70,80,90],[100,110,120]]])
print("3D array :\n\n",arr)

print(arr.ndim)

print(arr[0][0][0])