<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Database Connectivity - Demo</title>
</head>
<body>
    <?php

        $servername = "localhost";
        $username  = "root";
        $password = "";

        // create connectivity

        $conn = mysqli_connect($servername, $username, $password);

        // check connection

        if(!$conn)
        {
            die("Connection Failed: ".mysqli_connect_error());
        }

        echo "Connected Successfully...";

    ?>
</body>
</html>