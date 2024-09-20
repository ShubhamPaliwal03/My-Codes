<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>All Images</title>
    <style type="text/css">
        .image-icon
        {
            height: 220px;
            width: 220px;
            border: solid 15px black;
            outline: solid 5px darkgray;
            box-sizing: border-box;
        }
        .image-icon:hover
        {
            border: solid 5px darkgray;
            outline: solid 5px black;
        }
        .image-date-time
        {
            color: darkslateblue;
            font-weight: 700;
            font-size: 1.1em;
        }
        #heading
        {
            font-size: 50px;
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <p id="heading">Admin Panel</p>
    <?php

        include('connect.php');

        $sql = "select * from images;";

        $images = mysqli_query($conn, $sql);

        $recordEmpty = false;

        while($image = mysqli_fetch_assoc($images))
        {
            $recordEmpty = true;

            echo "<p><img class='image-icon' src='".$image['img_name']."'><br><span class='image-date-time'>".$image['upload_date_time']."</span><span><a href='update.php?prev_img_name=".$image['img_name']."'> Update |</a><a href='delete.php?img_name=".$image['img_name']."'> Delete</a></span></p>";
        }

        if($recordEmpty === false)
        {
            echo "<p>No Images Found!</p>";
        }
    ?>
</body>
</html>