<?php
    if(isset($_COOKIE['username']))
    {
        ?>
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Document</title>
            </head>
            <body>
                <h1>Welcome! <?php echo $_COOKIE['username'];?></h1>
                <a href="../logout.php?username=<?php echo $_COOKIE['username'];?>">Logout</a>
            </body>
            </html>
        <?php
    }
    else
    {
        header('location:../login.php');
    }
?>