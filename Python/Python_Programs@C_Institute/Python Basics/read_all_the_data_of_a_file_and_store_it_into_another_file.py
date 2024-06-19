source = input("Enter the name of the source file : ")

destination = input("\nEnter the name of the destination file : ")

reader = open(source,"r")

print("\nReading data from source file",source)

data = reader.read()

writer = open(destination,"w")

print("\nCopying data to destination file",destination)

writer.write(str(data))

print("\nContents of the source file",source,"successfully copied into the destination file",destination)

reader.close()
writer.close()