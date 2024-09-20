def printMatrix():

	print("\nThe Matrix is :\n")

	for i in range(rows):

		for j in range(cols):

			print(mat[i][j],end=" ")

		print()

def addMatrices():

	pass

rows1 = int(input("Enter the no. of rows in the 1st matrix you want to create : "))

cols1 = int(input("\nEnter the no. of rows in the 1st matrix you want to create : "))

mat1 = []

print("\nEnter",rows1*cols1,"elements into the matrix of order",rows,"x",cols,"\n")

for i in range(rows1):

	row1 = []

	for j in range(cols1):

		row1.append(int(input()))

	mat1.append(row1)

rows2 = int(input("Enter the no. of rows in the 2nd matrix you want to create : "))

cols2 = int(input("\nEnter the no. of rows in the 2nd matrix you want to create : "))

mat2 = []

print("\nEnter",rows2*cols2,"elements into the matrix of order",rows,"x",cols,"\n")

for i in range(rows2):

	row2 = []

	for j in range(cols2):

		row2.append(int(input()))

	mat2.append(row2)