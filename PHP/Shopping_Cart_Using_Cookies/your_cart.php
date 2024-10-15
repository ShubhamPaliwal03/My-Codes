<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="your_cart.css"></link>
    <title>Your Cart</title>
</head>
<body>
    <script src="https://kit.fontawesome.com/4ca0345904.js" crossorigin="anonymous"></script>
    <div id="navbar">
        <div id="logo-container" class="nav-inner">
            <a href="index.php"><img id="logo" src="Amazon-India-Logo.png" alt="amazon_india_logo"></a>
        </div>
        <div id="deliver-to" class="nav-inner">
            <i id="location_icon" class="fa-solid fa-location-dot"></i>
            <div>
                <p id="deliver-to-user">Deliver to</p>
                <p id="deliver-to-location">Bikaner 334001</p>
            </div>
        </div>
        <div id="search-bar-container" class="nav-inner">
            <input id="search_bar" type="search" name="searched-content" placeholder="Search Amazon.in">
        </div>
        <div id="cart-container" class="nav-inner">
            <div>
                <a href="your_cart.php"><img id="cart_img" src="cart_image.png" alt="cart_image"></a>
            </div>
            <div id="cart-item-count"><?php if(isset($_COOKIE['item-count-in-cart'])) echo $_COOKIE['item-count-in-cart']; else echo "0";?></div>
        </div>
        <div id="clear-cart-container" class="nav-inner">
            <form action="index.php" method="post">
                <button id="clear_cart_btn" name="clear_cart_btn">Clear Cart</button>
            </form>
        </div>
    </div>
    <?php
        if(!isset($COOKIE['items-in-cart']) || $COOKIE['items-in-cart'] === "0")
        {
            ?>
                <b>Your Cart is Empty!</b>
                <img id="cart-empty-image" src="cart_empty_image.svg" alt="cart_empty_image">
                <a href="index.php">Shop Now</a>
            <?php
        }
        else
        {
            ?>
                <table>
                    <tr>
                        <th>Product</th>
                        <th>Quantity</th>
                    </tr>
                    <?php
            
                    // split the products string into an array of product string
            
                    $products_string = substr($_COOKIE['items-in-cart'], 0, -1); // remove the extra '|' at the end of the string
                    
                    $products = explode("|", $products_string);
            
                    $unique_products = array();
                    
                    foreach($products as $product)
                    {
                        // split the product string into an array, containing the product name and quantity
            
                        $product_array = explode(":", $product);
            
                        // check if the current product already exists in the unique products array
            
                        if(isset($unique_products[$product_array[0]]))
                        {
                            $unique_products[$product_array[0]]++;
                        }
            
                        // if the product doesn't exist in the unique array
                        
                        else
                        {
                            $unique_products[$product_array[0]] = 1;
                        }
                    }
            
                    foreach($unique_products as $product => $qty)
                    {
                        ?>
                            <tr>
                                <td><?php echo "$product"; ?></td>
                                <td><?php echo "$qty"; ?></td>
                            </tr>
                        <?php
                    }
                    
                    ?>
                </table>
            <?php
        }
    ?>
</body>
</html>