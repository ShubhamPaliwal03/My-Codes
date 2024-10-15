string = input("Enter the space seperated list of elements that you want to arrayfi : ")

writer = open("arrayfied.txt","w") # to clear the previous contents of the file

writer.write('')

writer = open("arrayfied.txt","a") # to append the array elements into the file

writer.write("{")

for x in string:

	if x ==' ' :

		writer.write(', ')

	else :

		writer.write(x)

writer.write("}")

writer.close()

print('\nThe list has been arrayfied ! Check out the file "arrayfied.txt" for the result/output !')