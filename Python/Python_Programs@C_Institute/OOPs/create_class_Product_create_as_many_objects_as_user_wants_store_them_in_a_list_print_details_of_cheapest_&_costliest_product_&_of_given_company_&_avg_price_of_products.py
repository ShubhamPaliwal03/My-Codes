class Product:

	def __init__(self,serial_no):

		print("\nEnter the Details of the Product",serial_no,":")

		print("\n--------------------------------");

		self.serial_no = serial_no

		self.p_name = input("\nProduct Name : ")

		self.manufacturer = input("\nManufacturer Name : ")

		self.price = int(input("\nPrice (in Rs.) : "))

		self.category = input("\nCategory : ")

		print("\n--------------------------------");

	def get_price(self):
	
		return self.price

	def get_manufacturer_name(self):
	
		return self.manufacturer	

	def printDetails(self):
	
		print("\nThe Details of the Product are : ")

		print("\n--------------------------------");

		print("\nSerial Number :",self.serial_no)

		print("\nProduct Name :",self.p_name)

		print("\nManufacturer Name :",self.manufacturer)

		print("\nPrice :",self.price,"Rs.")

		print("\nCategory :",self.category)

		print("\n--------------------------------");

n = int(input("\nHow many Products do you want to add ? : "))

print("\n--------------------------------");

object_names = list()

objects = list()

for id in range(1,n+1):

	object_names.append("P"+str(id))
	objects.append("P"+str(id))


# for x in object_names:

# 	print("\n"+x) # to print the names of the objects of product class

i = 0

while(i!=n): # creating n objects of Product class

	objects[i] = Product(i+1)

	i+=1

# for x in object_names:

# 	x.printDetails() # to print the details of all the objects of product class

# for x in object_names:

# 	print(x)

# 	# if we try to print the details of all the objects of product class 
# 	# after creating the objects using the items of the list objects, then it will be replaced by the address of the particular object
#   # so the address of the object will be printed, like : "<__main__.Product object at 0x000002DED033E950>"
# 	# so, to retain the object names, we use a seperate list objects to store the objects, although we can only use a single list as well

max_price = min_price = objects[0].get_price()

index_costliest = index_cheapest = 0

sum_of_prices = 0

i = 0

for object in objects:

	if object.get_price() > max_price:

		max_price = object.get_price()

		index_costliest = i

	if object.get_price() < min_price:

		index_cheapest = i

	sum_of_prices += object.get_price()

	i+=1

print("\nThe Details of the Cheapest Product are : ")

print("\n---------------------------------------");

objects[index_cheapest].printDetails()

print("\nThe Details of the Costliest Product are : ")

print("\n----------------------------------------");

objects[index_costliest].printDetails()

sort_by_company = input("\nYou want to print all products and their details of which particular company ? : ")

print("\nThe Details of all the products of",sort_by_company,"are as follows : ")

print("\n--------------------------------------------------",end="");

for x in sort_by_company: # to format seperated output using correct number of -----

	print("-",end="")

print()	

for object in objects:

	if object.get_manufacturer_name()==sort_by_company:

		object.printDetails()

	else:

		print("\nNo Product of",sort_by_company,"found in the shopping cart !")	

print("\nThe Average Price of all the Products is :",sum_of_prices/n,"Rs.")

print("\n------------------------------------------------",end="");

for x in range(len(str(sum_of_prices))): # to format seperated output using correct number of -----

	print("-",end="")