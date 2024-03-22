<?php

    include('connect.php');

    $sql = "delete from images where img_name='".$_GET['img_name']."'";

    mysqli_query($conn, $sql);

    unlink($_GET['img_name']);

    header("refresh:1;url=http://localhost/PHP_Work/Image_Uploader/show_all_images.php");
    
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Redirecting...</title>
</head>
<body>
    <p>Image Deleted Successfully...</p>
    <p id="msg">You will be redirected to admin panel in 2 seconds...</p>
    <script>

        const msg = document.getElementById('msg')

        let t = 1

        let intervalId = setInterval(() => {
            msg.innerText = "You will be redirected to admin panel in "+t+" seconds..."
            t--
        }, 1000)

        if(t == 0)
        {
            clearInterval(intervalId)
        }

    </script>
</body>
</html>