<?php

    if(isset($_POST['add_product_btn']))
    {
        include('connect.php');

        $sql = "insert into inventory(product_name, product_price, product_img_link, quantity_in_stock) values('$_POST[product_name]', '$_POST[product_img_link]', '$_POST[product_qty_in_stock]')";

        if(mysqli_query($conn, $sql))
        {
            ?><script>alert("Product Added To Inventory Successfully...");</script><?php
        }
        else
        {
            ?><script>alert("Something Went Wrong :(");</script><?php
        }

    }

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Product</title>
</head>
<body>
    <form action="add_product.php" method="post">
        <label for="product_name">Enter Product Name : </label><input type="text" id="product_name" name="product_name"><br><br>
        <label for="product_price">Enter Product Price : </label><input type="text" id="product_price" name="product_price"><br><br>
        <label for="product_img_link">Enter Product Image Link : </label><input type="text" id="product_img_link" name="product_img_link"><br><br>
        <label for="product_qty_in_stock">Enter Product Quantity In Stock : </label><input type="text" id="product_qty_in_stock" name="product_qty_in_stock"><br><br>
        <input type="submit" value="Add Product" name="add_product_btn">
    </form>
</body>
</html>