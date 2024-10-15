# Write a Python function that takes in a list of integers as input and returns the maximum product of any three numbers from the list.
# Your function should handle both positive and negative numbers.
# Example:
# max_product_of_three([-10, -10, 5, 2]) # Output should be 500
# max_product_of_three([1, 2, 3, 4, 5]) # Output should be 60

# this solution does not work for lists having negative numbers

# def max_product_of_three(arr):
#     num1 = max(arr)
#     arr.remove(num1)
#     num2 = max(arr)
#     arr.remove(num2)
#     num3 = max(arr)
#     return num1 * num2 * num3
# print(max_product_of_three([-10, -10, 5, 2])) # fails on this test case
# print(max_product_of_three([1, 2, 3, 4, 5]))

# correct solution

def max_product_of_three(arr):
	max_product = 0
	for i in range(0, len(arr)):
		for j in range(i+1, len(arr)):
			for k in range(j+1, len(arr)):
				max_product = max(max_product, arr[i] * arr[j] * arr[k])
	return max_product
print(max_product_of_three([-10, -10, 5, 2]))
print(max_product_of_three([1, 2, 3, 4, 5]))