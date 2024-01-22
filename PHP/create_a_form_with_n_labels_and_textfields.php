<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Form with N labels and textfields</title>
    <style>
        body
        {
            margin-top: -20px;
        }
        p
        {
            font-size: 40px;
            font-weight: bold;
            text-decoration: underline;
        }
    </style>      
</head>
<body>
    <?php

        $n = 10;

        echo "<p>Form</p>";

        echo "<form>";

            for($i = 1; $i <= $n; $i++)
            {
                echo "<label>Enter Value&nbsp;:&nbsp;<input type=text></label><br><br>";
            }

        echo "</form>";

    ?>
</body>
</html>