<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your Cart</title>
</head>
<body>
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
</body>
</html>