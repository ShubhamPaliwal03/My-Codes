<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Create Desired Table</title>
    <style type="text/css">
        table
        {
            border-collapse: collapse;
        }
        td
        {
            border: solid 2px black;
            border-collapse: collapse;
            padding: 15px;
        }
        td:hover
        {
            border-color: red;
        }
    </style>
</head>
<body>
    <?php

        function create_table($rows, $cols, $foregroundColor, $backgroundColor)
        {
            echo"<table>";

            for($i = 0; $i < $rows; $i++)
            {
                echo"<tr>";

                for($j = 0; $j < $cols; $j++)
                {
                    echo'<td style="color:'.$foregroundColor.';background-color:'.$backgroundColor.';">R'.$i.'C'.$j.'</td>';
                }

                echo"</tr>";
            }

            echo "</table>";
        }

        if(isset($_POST['submit'])) // if the user clicked on the submit button
        {
            create_table($_POST['rows'], $_POST['cols'], $_POST['foreground'] ,$_POST['background']);
        }
        else
        {
            ?>
                <form method="post" action="create_desired_table.php">
                    <label for="row">Enter Number of Rows: </label><input type="number" id="row" name="rows"><br><br>
                    <label for="col">Enter Number of Cols: </label><input type="number" id="col" name="cols"><br><br>
                    <label for="foreground">Enter Foreground Color: </label><input type="text" name="foreground" id="foreground"><br><br>
                    <label for="background">Enter Background Color: </label><input type="text" name="background" id="background"><br><br>
                    <input type="submit" name="submit" value="Create Table">
                    <input type="reset" name="reset"  value="Reset Data">
                </form>
            <?php
        }
    ?>
</body>
</html>