string = input("Enter a string : ")

string_list = string.split(" ")

empty_list = []

for i in string_list :

	empty_list.append(i[::-1])

word_reversed_string = " ".join(empty_list)

print("The string containing reverse of every word of the string is :",word_reversed_string)