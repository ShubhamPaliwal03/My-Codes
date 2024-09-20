<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Table</title>
    <style>
        table,td
        {
            border : solid 1px black;
            border-collapse: collapse;
        }
        td
        {
            padding: 5px;
        }
        tr:nth-child(even)
        {
            background-color: goldenrod;
        }
        tr:nth-child(odd)
        {
            background-color: cornflowerblue;
        }
    </style>
</head>
<body>
    <?php

        $rows = 5;
        $cols = 4;
        
        echo "<table>";

            for($i = 1; $i <= $rows; $i++)
            {
                echo "<tr>";

                for($j = 1; $j <= $cols; $j++)
                {
                    echo "<td>R$i C$j</td>";
                }

                echo "</tr>";
            }

        echo "</table>";

    ?>
</body>
</html>