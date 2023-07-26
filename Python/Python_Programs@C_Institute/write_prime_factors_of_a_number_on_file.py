n = num = int(input("Enter a number : "))

writer = open("prime_factors_result.txt","w")

writer.write("The Prime Factors of "+str(num)+" are :\n\n")

# if we do not typecast num in the above statement, then the error would be : "TypeError: can only concatenate str (not "int") to str"
# remember we can only use ',' to concatenate values in the print() statement
# otherwise like in input() and in general to concatenate strings, we will have to use + to concatenate

writer.close()

writer = open("prime_factors_result.txt","a")

i=2

while(num>1):

	if(num%i==0):

		writer.write(str(i)+" ")

		num = num//i

	else:

		i+=1

#if you use the below statement, this will be entirely treated as a string
# writer.open('\nThe Prime Factors of "+str(n)"+ have been found, check the file "prime_factors_result.txt" for results')
# either use single quoted string or double quoted string for the entire string and use the opposite for including '' or ""

print('\nThe Prime Factors of',n,'have been calculated, check the file "prime_factors_result.txt" for the results....')


writer.close()