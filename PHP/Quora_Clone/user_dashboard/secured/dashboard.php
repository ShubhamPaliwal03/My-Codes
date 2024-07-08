<?php
    if(isset($_COOKIE['username']) && isset($_COOKIE['uid']))
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
                <?php
                    $uid = $_COOKIE['uid'];

                    include('../connect.php');

                    $sql_users_table = "select user_image, user_title from `users` where uid = $uid";
                    $records = mysqli_query($conn, $sql_users_table);
                    $data = mysqli_fetch_assoc($records);
                    $user_image = $data['user_image'];
                    $user_title = $data['user_title'];
                ?>
                <div class="flex-container">
                    <div id="profile-pic-container">
                        <img src="<?php echo('');?>" alt="">
                    </div>
                </div>
                <!-- <h1>Welcome! <?php echo $_COOKIE['username'];?></h1>
                <a href="../logout.php?username=<?php echo $_COOKIE['username'];?>">Logout</a> -->
            </body>
            </html>
        <?php
    }
    else
    {
        header('location:../login.php');
    }
?>