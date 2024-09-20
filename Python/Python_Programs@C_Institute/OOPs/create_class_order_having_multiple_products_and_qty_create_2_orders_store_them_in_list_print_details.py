class Order:

	def __init__(self,order_serial):

		print("\nEnter the Details of the",order_serial,"order :")

		print("\n-------------------------------------");

		self.order_serial = order_serial

		self.customer_name = input("\nCustomer Name : ")

		self.salesman_name = input("\nSalesman Name : ")

		self.order_date = input("\nOrder Date : ")

		print("\n-------------------------------------");

		self.total_bill = 0

		self.order_details = []

		choice = "yes"

		p_count = 1

		while choice.lower()=="yes":

			a_product = Product(p_count)

			self.order_details.append(a_product.get_product_details())

			self.total_bill += a_product.get_price()*a_product.get_quantity()

			p_count += 1

			choice = input("\nWould you like to add any more products ? (yes/no) : ")

			print("\n--------------------------------------------------");	

	def printDetails(self):

		print("\nThe Details of the",self.order_serial,"order are : ")

		print("\n-------------------------------------");

		print("\nCustomer Name :",self.customer_name)

		print("\nSalesman Name :",self.salesman_name)

		print("\nOrder Date :",self.order_date)

		print("\nOrder Details (Product, Price (in Rs.), Quantity) : ")

		print("\n-------------------------------------------------");

		print()

		for detail in self.order_details:

			print(detail)

		print("\n-------------------------------------------------");	

		print("\nTotal Bill Amount :",self.total_bill,"Rs.")

		print("\n-------------------------------------");

class Product:

	def __init__(self,p_count):

		print("\nEnter the Details of product",p_count,":")

		print("\n-------------------------------");

		self.name = input("\nName : ")

		self.price = int(input("\nPrice (in Rs.) : "))

		self.quantity = int(input("\nQuantity : "))

		self.product_details = (self.name,self.price,self.quantity)

		print("\n-------------------------------");

	def get_product_details(self):
	
		return self.product_details

	def get_price(self):

		return self.price

	def get_quantity(self):

		return self.quantity	

orders = {"1":"First","2":"Second"}

order_list = list()

# order1 = Order("First")

# order_list.append(order1)

# order2 = Order("Second")

# order_list.append(order2)

for x in orders:

	order = Order(orders[x])

	order_list.append(order)

for x in order_list:

	x.printDetails()