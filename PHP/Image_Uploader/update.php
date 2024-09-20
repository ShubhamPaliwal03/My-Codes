<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Image</title>
</head>
<body>
    <?php

        if(isset($_POST['upload_image']))
        {
            include('connect.php');

            $name = $_FILES['image']['name'];

            $tmp_name = $_FILES['image']['tmp_name'];

            // update the image name in the images table

            $sql = "update images set img_name='images/$name' where img_name='".$_GET['prev_img_name']."'";
            
            mysqli_query($conn, $sql);

            // delete the previous image file from the server folder

            unlink($_GET['prev_img_name']);

            // add the newly selected image file to the server folder

            move_uploaded_file($tmp_name, "images/".$name);

            header("location: http://localhost/PHP_Work/Image_Uploader/show_all_images.php");
        }
        else
        {
            ?>
                <form enctype="multipart/form-data" method="post">
                    <input type="file" name="image">
                    <input type="submit" name="upload_image" value="Upload New Image">
                </form>
            <?php
        }
    ?>

</body>
</html>