<?php

    if(!isset($_COOKIE['item-count-in-cart']))
    {
        setcookie("item-count-in-cart", 0, time()+60*60);
    }

    if(isset($_POST['add_to_cart_btn']))
    {
        if(isset($_COOKIE['item-count-in-cart']))
        {
            $items_in_cart = $_COOKIE['item-count-in-cart'];

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

        header("location:shopping_mart.php");
    }

    if(isset($_POST['clear_cart_btn']))
    {
        setcookie("item-count-in-cart", 0, time()+60*60);

        setcookie("items-in-cart", " ", time()+60*60);

        header("location:shopping_mart.php");
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
        <!-- <link rel="stylesheet" href="main_style.css"> -->
        <title>Amazon.in</title>
        <style type="text/css">
            body
            {
                font-family: sans-serif; 
                margin: 0px;
                padding: 0px;
                background-color: #e3e6e6;
            }
            #outer_container
            {
                margin: 9em;
                display: flex;
                flex-direction: row;
                align-items: center;
                justify-content: center;
            }
            #product_name
            {
                text-wrap: balance;
                font-weight: 600;
            }
            .product_img
            {
                height: 10em;
                width: 10em;
            }
            .inner_container
            {
                display: flex;
                flex-direction : column;
                align-items: center;
                justify-content: center;
            }
            .product_container
            {
                text-align: center;
                padding: 2em;
                background-color: #FFF;
                margin-bottom: 1.875em;
                margin-right: 1.875em;
                display: flex;
                flex-direction : column;
                align-items: center;
                justify-content: center;
            }
            #out_of_stock_img
            {
                position: absolute;
                height: 6em;
                width : 9em;
                z-index: 999;
            }
            .product-inner-container
            {
                display: flex;
                flex-direction : column;
                align-items: center;
                justify-content: center;
            }
            #add_to_cart_btn
            {
                width: 8em;
                height: 3em;
                font-size: 0.9em;
                background-color: #ffd814;
                border: none;
                border-radius: 0.5em;
                transition: scale 0.2s;
            }
            #add_to_cart_btn:hover
            {
                scale: 1.1;
            }
            #cart_img
            {
                height: 2.5em;
                width: 2.5em;
                filter: invert(100%);
            }
            #cart-container
            {
                display: flex;
                align-items: center;
                justify-content: center; 
            }
            #cart-container:hover
            {
                cursor: pointer;
            }
            #navbar
            {
                display: flex;
                align-items: center;
                justify-content: space-evenly;
                background-color: #131921;
                padding: 0.5em 0em;
                position: fixed;
                z-index: 1000;
                /* This (below) is done to give our flex-box room to breathe and do it's flex-box thing 
                If the flex-direction is column, we could use top, left, bottom instead.
                This works because when we give an element a fixed position and a left and right of 0 or a top and bottom of 0, the element is stretched to fill the space from left to right, or top to bottom. That in turn allows a flex-box to use the amount of space we would expect without position fixed. */
                
                top: 0px;
                left: 0px;
                right: 0px;
            }
            .nav-inner:hover
            {
                border: solid 1px white;
            }
            #cart-item-count
            {
                display: flex;
                align-items: center;
                justify-content: center;
                text-align: center;
                /* position: absolute;
                z-index: 1000; */
                font-size: 0.9em;
                font-weight: 700;
                background-color: #f89c35;
                color: #131921;
                width: 1.2em;
                height: 1.2em;
                border-radius: 1.4em;
            }
            #clear-cart-container
            {
                display: flex;
                align-items: center;
                justify-content: space-around;
            }
            #logo
            {
                height: 2.5em;
                width: 8em;
            }
            #deliver-to-user, #deliver-to-location
            {
                margin: 0px;
                color: white;
                font-size: 0.9em;
            }
            #deliver-to-location
            {
                font-weight: 700;
            }
            #location_icon
            {
                filter: invert(100%);
                margin-right: 0.5em;
            }
            #deliver-to
            {
                display: flex;
                flex-direction: row;
                align-items: center;
            }
            #search_bar
            {
                height: 2.7em;
                width: 40vw;
                font-size: 0.9em;
                padding-left: 1em;
            }
        </style>
    </head>
    <body>
        <script src="https://kit.fontawesome.com/4ca0345904.js" crossorigin="anonymous"></script>
        <div id="navbar">
            <div id="logo-container" class="nav-inner">
                <a href="shopping_mart.php"><img id="logo" src="Amazon-India-Logo.png" alt="amazon_india_logo"></a>
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
                <div id="cart-item-count"><?php echo$_COOKIE['item-count-in-cart'];?></div>
            </div>
            <div id="clear-cart-container" class="nav-inner">
                <form action="shopping_mart.php" method="post">
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
                            <form action="shopping_mart.php" method="post">
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