<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insert Records Into Database By Taking Data From Form</title>
</head>
<body>
    <?php

        if(isset($_POST['submit']))
        {   
            $servername = "localhost";
            $username = "root";
            $password = "";
            $dbname = "college";
        
            $conn = mysqli_connect($servername, $username, $password, $dbname);

            $roll_number = $_POST['roll_number'];
            $first_name = $_POST['first_name'];
            $last_name = $_POST['last_name'];
            $email_address = $_POST['email_address'];
            $age = $_POST['age'];
            
            $sql = "insert into student values('$roll_number','$first_name', '$last_name', '$email_address', '$age')";

            if(mysqli_query($conn, $sql))
            {
                echo "Record added successfully...";
            }
            else
            {
                echo "Something Went Wrong :(";
            }
        }
        else
        {                
            ?>
                <form method="post">
                    <label>Roll Number :&nbsp;<input type="number" name="roll_number"></label><br><br>
                    <label>First Name :&nbsp;<input type="text" name="first_name"></label><br><br>
                    <label>Last Name :&nbsp;<input type="text" name="last_name"></label><br><br>
                    <label>Email Address :&nbsp;<input type="email" name="email_address"></label><br><br>
                    <label>Age :&nbsp;<input type="number" name="age"></label><br><br>
                    <input type="submit" name="submit">
                    <input type="reset" name="reset">
                </form>
            <?php
        }  
    ?>
</body>
</html>