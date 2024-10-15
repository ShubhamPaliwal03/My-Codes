# Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
# Example:
# Input: [1, 2, 3, 4]
# Output: [24, 12, 8, 6]

def product_except_nums(nums):
    prefix_product = [nums[0]]
    for i in range(1, len(nums)):
        prefix_product.append(prefix_product[i-1] * nums[i])
    products = []
    for i in range (0, len(nums)):
        products.append(prefix_product[len(prefix_product)-1] // nums[i])
    return products
print(product_except_nums([1, 2, 3, 4]))