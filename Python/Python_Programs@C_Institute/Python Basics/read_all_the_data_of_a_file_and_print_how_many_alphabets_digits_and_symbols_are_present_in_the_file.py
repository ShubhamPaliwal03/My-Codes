filename = input("Enter the name of the file on which you want to perform text analysis: ")

reader = open(filename,"r")

data = reader.read()

# print(type(data)) # <class 'str'>

alp=0
dig=0
sym=0

for ch in data:

	if ch>='a' and ch<='z' or ch>='A' and ch<='Z': # for checking alphabets

		# we can't directly use an ascii value like 65 because we can't compare objects or instances of str and int
		# otherwise, the error would be like : "TypeError: '>=' not supported between instances of 'str' and 'int'"


		alp+=1

	elif ch>='0' and ch<='9': # for checking numbers

		dig+=1

	else: # for checking symbols
	
		sym+=1

writer = open("file_analysis_results.txt","w")

writer.write("The Text Content Analysis of the file is as follows : ")

writer.write(("\n\nNumber of Alphabets : "+str(alp)))
writer.write(("\n\nNumber of Digits : "+str(dig)))
writer.write(("\n\nNumber of Symbols : "+str(sym)))

reader.close()
writer.close()

print("\nText Analysis Completed...Check the file 'file_analysis_results.txt' for the results...")