# Q1.  WAP to create a list. The elements of list must be entered by user. 
# After entering every element ask user whether he wants to add more elements or not. 
# If user does not want to enter more element then stop entering further elements and print the list in reverse order using list slicing.

list1 = []

choice = "y"

while choice.lower() == "y" :

	data = input("\nEnter the element you want to add to the list : ")

	list1.append(data)

	choice = input("\nDo you want to add more elements to the list?\n\nIf yes, then Press y / Y, or Press any other key to stop adding more elements : ")

print("\nThe list in reverse order is as follows :\n")

print(list1[::-1])