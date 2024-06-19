<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Rendered Table</title>
    <style>
        table, td
        {
            border: solid 2px black;
            border-collapse: collapse;
        }
        td
        {
            padding: 10px;
        }
    </style>
</head>
<body>
    <?php

        /* Method - 1 */

        echo "<table>";

        foreach($_POST as $k => $v)
        {
            if($k === "proceed")
            {
                break;
            }

            if(empty($v))
            {
                echo "<tr><td>$k</td><td>Undefined</td></tr>";
            }
            else
            {
                echo "<tr><td>$k</td><td>$v</td></tr>";
            }
        }

        echo "</table>";

        /* Method - 2 */

        /*
        $firstname = $_POST['firstname'];

        $lastname = $_POST['lastname'];

        $dob = $_POST['dob'];

        $gender = $_POST['gender'];

        $email = $_POST['email'];

        $mobile = $_POST['mobile'];

        echo "<table>";

            echo "<tr>";
                echo "<td>First Name</td>";
                echo "<td>".$firstname."</td>";
            echo "</tr>";

            echo "<tr>";
                echo "<td>Last Name</td>";
                echo "<td>".$lastname."</td>";
            echo "</tr>";

            echo "<tr>";
                echo "<td>DOB (yyyy-mm-dd)</td>";
                echo "<td>".$dob."</td>";
            echo "</tr>";

            echo "<tr>";
                echo "<td>Gender</td>";
                echo "<td>".$email."</td>";
            echo "</tr>";

            echo "<tr>";
                echo "<td>Mobile</td>";
                echo "<td>".$mobile."</td>";
            echo "</tr>";

        echo "</table>"
        */
    ?>
</body>
</html>