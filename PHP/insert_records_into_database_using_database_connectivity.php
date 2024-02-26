<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insert Records Into Database Using Database Connectivity</title>
</head>
<body>
    <?php
        $servername = "localhost";
        $username = "root";
        $password = "";
        $dbname = "college";

        $conn = mysqli_connect($servername, $username, $password, $dbname);

        $sql = "insert into student values('1001', 'Tarun', 'Verma', 'verma_tarun@gmail.com', '36')";

        if(mysqli_query($conn, $sql))
        {
            echo "Record Saved Successfully...";
        }
        else
        {
            echo "Something Went Wrong :(";
        }
    ?>
</body>
</html>