# def main(nums, index, sum_of_squares):

# 	if index == len(nums):
# 		return sum_of_squares

# 	if nums[index] >= 0:
# 		sum_of_squares += (nums[index] ** 2)

# 	sum_of_squares = main(nums, index + 1, sum_of_squares)

# 	return sum_of_squares

# def append_into_list(input_string, input_array, index):

# 	if index == len(input_string):
# 		return

# 	if(input_string[index].isdigit()):
# 		input_array.append(int(input_string[index]))

# 	append_into_list(input_string, input_array, index + 1)

# def input_x_integers(x, input_array):

# 	if x == 0:
# 		return input_array

# 	append_into_list(input(), input_array, 0)

# 	input_array = input_x_integers(x-1, input_array)

# 	print(main(input_array, 0, 0))

# def input_n_testcases(n):

# 	if n == 0:
# 		return

# 	x = int(input())	

# 	input_x_integers(x, [])	

# 	input_n_testcases(n-1)

# if __name__ == "__main__":

# 	n = int(input())

# 	input_n_testcases(n)

