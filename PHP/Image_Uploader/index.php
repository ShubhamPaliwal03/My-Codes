<?php
    if(isset($_POST['upload_image']))
    {
        $name = $_FILES['image']['name'];

        $tmp_name = $_FILES['image']['tmp_name'];

        move_uploaded_file($tmp_name, "images/".$name);

        include('connect.php');

        $sql = "insert into images(img_name) values('images/$name')";

        mysqli_query($conn, $sql);

        ?> <script>alert("Image Uploaded Successfully...")</script> <?php
    }
    ?>
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
        </head>
        <body>
            <form enctype="multipart/form-data" method="post">
                <input type="file" name="image"><br>
                <input type="submit" name="upload_image" value="Upload Image">
            </form>
            <a href="show_all_images.php">Show All Images</a>
        </body>
        </html>
    <?php
?>