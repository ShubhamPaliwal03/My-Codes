<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.dev.shubhampaliwal.*, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Cart</title>
</head>
<body>
	<form action="index.jsp" method="post">
		Product
		<select name="product_name" required>
			<option>Washing Powder</option>
			<option>Talcum Powder</option>
			<option>Bathing Soap</option>
			<option>Biscuits</option>
			<option>Atta</option>
		</select>
		<label>
			Quantity
			<input type="number" name="quantity" required>
		</label>
		<label>
			Price
			<input type="number" name="price">
		</label>
		<input type="submit" value="Add To Cart" name="add_to_cart" required>
	</form>
	<%
		Cart cart;
	
		if(session.getAttribute("cart") != null) {
			
			cart = new Cart();
			
			session.setAttribute("cart", cart);
		}
		else {
			
			cart = session.getAttribute("cart");
		}
	
		if(request.getParameter("add_to_cart").equals("Add To Cart")) {
			
			
			String product_name = request.getParameter("product_name");
			double price = request.getParameter("price");
			int quantity = request.getParameter("quantity");
			
			cart.addProduct(product_name, price, quantity);
		}
		
		if(cart.getCartItemCount() == 0) 
		{
			
			%><h3>Cart is Empty!</h3><%
		}
		else 
		{
		  %>
			  <table>
			  	<caption>Cart</caption>
			  	<tr>
			  		<th>S.No.</th>
			  		<th>Product</th>
			  		<th>Quantity</th>
			  		<th>Price</th>
			  		<th>Sub Total</th>
			  	</tr>
			  	<%
			 		// code for rendering the cart table
			 		
			 		int s_no = 1;
			 				
			 		// List<CartItem> cartItems = cart.getCartItems();
			 		
			 		for(CartItem ci : cart.getCartItems()) 
			 		{	
			 			%>
			 				<tr>
			 					<td><%= s_no++%></td>
			 				</tr>
			 				<tr>
			 					<td><%= ci.getProductName()%></td>
			 				</tr>
			 				<tr>
			 					<td><%= ci.getQuantity()%></td>
			 				</tr>
			 				<tr>
			 					<td><%= ci.getPrice()%></td>
			 				</tr>
			 				<tr>
			 					<td><%= ci.getQuantity()*ci.getPrice()%></td>
			 				</tr>
			 			<%
			 		}
			  	%>
			  	<tr>
			  		<td></td>
			  		<td></td>
			  		<td></td>
			  		<td><%= cart.getTotalBillAmount()%></td>
			  	</tr>
			  </table>
		}
</body>
</html>