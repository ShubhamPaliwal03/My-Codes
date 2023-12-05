test_cases = []

while True:

	try:

		line = input()

		# break the loop if the input is empty

		if not line:

			break

		# store the string in the list of test cases
		
		test_cases.append(line)

	except EOFError:
	
		break

Sum = 0

for t in test_cases:

	val1 = -1

	val2 = -1

	first_val_found = False

	for ch in t:

		if ch.isdigit():

			if not first_val_found:
			
				first_val_found = True

				val1 = int(ch)

			else:

				val2 = int(ch)

	if val2 == -1:

		val2 = val1

		print("used")

	print(str(val1)+str(val2))

	num = int(str(val1)+str(val2))

	Sum += num

print(Sum)