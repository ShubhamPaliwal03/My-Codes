string = input("Enter a string : ")

dlist = list()

dashedLine = str()

for x in string:

	dlist.append('-')	
	dashedLine = ''.join(dlist)

# print(dlist)
# print(dashedLine)

print('print("',dashedLine,'");')