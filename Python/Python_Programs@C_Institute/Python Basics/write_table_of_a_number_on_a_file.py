n = int(input("Enter a number : "))

writer = open("table_of_a_number","w")

i=1
while i!=10:

	writer.write(str(n*i)+"\n")
	i+=1

writer.close()