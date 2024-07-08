import java.util.*;

class Product
{
	private String name;
	private int price;

	public void inputProductDetails()
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nName : ");

		name = kb.nextLine();

		System.out.print("\nPrice : ");

		price = kb.nextInt();
	}

	public String getName()
	{
		return name;
	}

	public int getPrice()
	{
		return price;
	}
}

class Cart
{
	private LinkedList<Product> productList;
	private LinkedList<Integer> quantityList;
	private double totalBill;

	Cart()
	{
		productList = new LinkedList<>();
		quantityList = new LinkedList<>();
	}

	public void addProduct(Product p, int qty)
	{
		// add the product to the productList

		productList.add(p);

		quantityList.add(qty);

		totalBill += p.getPrice() * qty;
	}

	public void deleteProductFromCart(String product_name)
	{
		if(productList == null || productList.size() == 0)
		{
			System.out.println("\nCart Is Empty!");
		}
		else
		{
			int i = 0;

			for(i = 0; i < productList.size(); i++)
			{
				if(productList.get(i).getName().equals(product_name))
				{
					break;
				}
			}

			if(i == productList.size())
			{
				System.out.println("\nProduct '"+product_name+"' Not Found In Cart!");
			}
			else
			{
				// remove the subtotal of this product form the total bill

				totalBill -= productList.get(i).getPrice() * quantityList.get(i);

				// remove the product from the product linked list

				productList.remove(i);

				quantityList.remove(i);

				System.out.println("\nProduct '"+product_name+"' From The Cart Successfully...");
			}
		}
	}

	public void showCartDetails()
	{
		if(productList == null || productList.size() == 0)
		{
			System.out.println("\nCart Is Empty!");
		}
		else
		{
			System.out.println("\nThe Cart Is As Follows : ");

			System.out.println("\nS.No.\t\t\tProduct Name\t\t\tProduct Price\t\t\tProduct Quantity\t\t\tSubtotal");

			System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------");

			for(int i = 0; i < productList.size(); i++)
			{
				System.out.println("\n"+(i+1)+"\t\t\t"+productList.get(i).getName()+"\t\t\t$"+productList.get(i).getPrice()+"\t\t\t"+quantityList.get(i)+"\t\t\t$"+productList.get(i).getPrice()*quantityList.get(i));
			}

			System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------");

			System.out.println("\nTotal Bill : $"+totalBill);

			System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------");
		}
	}

	public void clearCart()
	{
		productList = null;

		quantityList = null;

		System.out.println("\nCart Cleared Successfully!");
	}
}

class UseMyCart
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		Cart myCart = new Cart();

		do
		{
			System.out.println("\nWhich Operation Would You Like To Perform ?\n\n1.Add Product To Cart\n2.Delete Product From Cart\n3.Show Cart Details\n4.Clear Cart");

			System.out.print("\nSelect Your Choice (1-4) : ");

			switch(kb.nextInt())
			{
				case 1:

					System.out.print("\nHow Many Products Do You Want To Enter : ");

					int n = kb.nextInt();

					for(int i = 1; i <= n; i++)
					{
						System.out.println("\nEnter The Details Of the Product "+i+" : ");

						Product p = new Product();

						p.inputProductDetails();

						System.out.print("\nQuantity : ");

						int qty = kb.nextInt();

						myCart.addProduct(p, qty);
					}

					System.out.println("\n"+n+" Product(s) successfully added to cart...");

					break;

				case 2:

					System.out.print("\nEnter The Name Of The Product That You Want To Delete From The Cart : ");

					myCart.deleteProductFromCart(kb.next());

					break;

				case 3:

					myCart.showCartDetails();
				
					break;

				case 4:

					myCart.clearCart();

					break;

				default:
				
					System.out.println("\nInvalid Choice Entered! Please Enter a Choice Between (1-4)!");	
			}

			System.out.print("\nPress y/Y To Continue, Press Any Other Key To Exit : ");

		} while(kb.next().toLowerCase().charAt(0) == 'y');
	}
}