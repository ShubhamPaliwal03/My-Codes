<?php

    if(!isset($_COOKIE['item-count-in-cart']))
    {
        setcookie("item-count-in-cart", "0", time()+60*60);
    }

    if(isset($_POST['add_to_cart_btn']))
    {
        if(isset($_COOKIE['item-count-in-cart']))
        {
            $items_in_cart = (int)$_COOKIE['item-count-in-cart'];

            setcookie("item-count-in-cart", $items_in_cart+1, time()+60*60);
        }

        $current_product = $_POST['product_name'].":1|";

        if(isset($_COOKIE['items-in-cart']))
        {
            $all_products = $_COOKIE['items-in-cart'];

            $all_products .= $current_product;

            setcookie("items-in-cart", $all_products, time()+60*60);
        }
        else
        {
            setcookie("items-in-cart", $current_product, time()+60*60);
        }

        header("location:index.php");
    }

    if(isset($_POST['clear_cart_btn']))
    {
        setcookie("item-count-in-cart", 0, time()+60*60);

        setcookie("items-in-cart", " ", time()+60*60);

        header("location:index.php");
    }

    // load all the products in the inventory, into the page

    include('connect.php');

    $sql = "select * from inventory";

    $records = mysqli_query($conn, $sql);

?>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" type="image/png" href="Amazon_favicon.svg">
        <link rel="stylesheet" href="main_style.css">
        <title>Amazon.in</title>
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
            $products = 1;

            ?><div id='outer_container'><?php

            while($data = mysqli_fetch_assoc($records))
            {
                if($products === 1)
                {
                    ?><div class='inner_container'><?php
                }
                    ?>
                        <div class='product_container'>
                            <div class='product-inner-container'>
                                <img class='product_img' id='product_<?php echo"$data[s_no]_img";?>' src='<?php echo"$data[product_img_link]";?>' alt='product_image'>
                                <img id='out_of_stock_img' src='sold-out-transparent_img.png'
                                    <?php if($data['quantity_in_stock'] != 0){echo ' hidden';}?>
                                >
                            </div>
                            <p id='product_name'><?php echo"$data[product_name]";?></p>
                            <p id="price">₹<?php echo"$data[product_price]";?></p>
                            <form action="index.php" method="post">
                                <button id='add_to_cart_btn' name='add_to_cart_btn'
                                    <?php if($data['quantity_in_stock'] == 0){echo ' disabled';}?>>Add To Cart
                                </button>
                                <input type="text" name="product_name" value="<?php echo"$data[product_name]";?>" hidden>
                                <input type="text" name="product_price" value="<?php echo"$data[product_price]";?>" hidden>
                            </form>
                        </div>
                        <?php 
                            if($data['quantity_in_stock'] == 0)
                            {
                                ?><script>document.getElementById('product_<?php echo"$data[s_no]";?>_img').style.opacity = '0.45'</script><?php
                            }
                        ?>
                    <?php
                    $products++;
                
                if($products === 6)
                {
                    ?></div><?php

                    $products = 1;
                }    
            }
        ?>
            </div>
    </body>
    </html>