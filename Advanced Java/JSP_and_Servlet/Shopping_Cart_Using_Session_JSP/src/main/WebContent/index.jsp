<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.dev.shubhampaliwal.*, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./style.css">
<title>My Cart</title>
</head>
<body>
	<div id="app-container">
	<div id="input-container">
	<form action="index.jsp" method="post">
		<fieldset>
			<legend>Add Items To Your Cart</legend>
			Product
			<select name="product_name" required>
				<option>Washing Powder</option>
				<option>Talcum Powder</option>
				<option>Bathing Soap</option>
				<option>Biscuits</option>
				<option>Atta</option>
			</select>
			<br><br>
			<label>
				Quantity
				<input type="number" name="quantity" required>
			</label>
			<br><br>
			<label>
				Price
				<input type="number" name="price" step="0.01">
			</label>
			<br><br>
			<input type="submit" value="Add To Cart" name="add_to_cart" required>
		</fieldset>
		<br><br>
	</form>
	</div>
	<%
		Cart cart;
	
		if(session.getAttribute("cart") == null) {
			
			cart = new Cart();
			
			session.setAttribute("cart", cart);
		}
		else {
			
			cart = (Cart)session.getAttribute("cart");
		}
	
		if(request.getParameter("add_to_cart") != null) {
			
			
			String product_name = request.getParameter("product_name");
			double price = Double.parseDouble(request.getParameter("price"));
			int quantity = Integer.parseInt(request.getParameter("quantity"));
			
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
			  		<th>Subtotal</th>
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
			 					<td><%= ci.getProductName()%></td>
			 					<td><%= ci.getQuantity()%></td>
			 					<td><%= ci.getPrice()%></td>
			 					<td><%= ci.getQuantity()*ci.getPrice()%></td>
			 				</tr>
			 			<%
			 		}
			  	%>
			  	<tr>
			  		<td>Total</td>
			  		<td></td>
			  		<td></td>
			  		<td></td>
			  		<td><%= cart.getTotalBillAmount()%></td>
			  	</tr>
			  </table>
			  <%
		}%>
		</div>
</body>
</html>