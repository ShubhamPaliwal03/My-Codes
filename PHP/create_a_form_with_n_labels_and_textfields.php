<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Form with N labels and textfields</title>
</head>
<body>
    <?php

        $n = 5;

        echo "<h1>Form</h1>";

        echo "<form>";

            for($i = 1; $i <= $n; $i++)
            {
                echo "<label>Enter Value:&nbsp;&nbsp;<input type=text></label><br>";
            }

        echo "</form>";

    ?>
</body>
</html>