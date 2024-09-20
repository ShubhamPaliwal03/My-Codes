<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Display Two 2-D Matrices and Their Sum Matrix</title>
    <style type="text/css">
        table, td
        {
            border: solid 2px black;
            border-collapse: collapse;
        }
        span
        {
            margin: 0px auto;
            margin-right: 20px;
        }
    </style>
</head>
<body>
        <?php
            $arr1 = array(array(1, 2, 3, 4), array(5, 6, 7, 8), array(9, 10, 11, 12));
            $arr2 = array(array(1, 2, 3, 4), array(5, 6, 7, 8), array(9, 10, 11, 12));

            ?><span><?php
            
                ?><table><?php

                    foreach($arr1 as $row)
                    {
                        ?><tr><?php

                            foreach($row as $cell)
                            {
                                ?>
                                    <td><?php echo($cell);?></td>
                                <?php
                            }

                        ?></tr><?php
                    }

                ?></table><?php
                    
            ?></span><?php

            ?><span><?php
            
                ?><table><?php

                    foreach($arr2 as $row)
                    {
                        ?><tr><?php

                            foreach($row as $cell)
                            {
                                ?>
                                    <td><?php echo($cell);?></td>
                                <?php
                            }

                        ?></tr><?php
                    }

                ?></table><?php
                    
            ?></span><?php
            
            if(count($arr1) != count($arr2) || count($arr1[0]) != count($arr1[0]))
            {
                ?>
                    <span>
                        <table>
                            <tr>
                                <td>Invalid Operands</td>
                            </tr>
                        </table>
                    </span>
                <?php
            }
            else
            {
                ?><span><?php
                
                    ?><table><?php

                        for($i = 0; $i < count($arr1); $i++)
                        {
                            ?><tr><?php

                                for($j = 0; $j < count($arr1[0]); $j++)
                                {
                                    ?>
                                        <td><?php echo($arr1[$i][$j]+$arr2[$i][$j]);?></td>
                                    <?php    
                                }

                            ?></tr><?php
                        }

                    ?></table><?php
                    
                ?></span><?php
            }
        ?>
    </table>
</body>
</html>