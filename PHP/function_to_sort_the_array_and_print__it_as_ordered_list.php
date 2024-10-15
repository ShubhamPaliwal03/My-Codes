<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Function To Sort The Array And Print It As Ordered List</title>
    <style type="text/css">

        body
        {
            background-color: black;
            color: white;
        }

        #msg
        {
            font-weight: 600;
            font-size: 30px;
            text-decoration: underline;
        }

        div
        {
            margin-left: 20px;
        }

    </style>
</head>
<body>
    <?php
            function sortArray(...$arr)
            {   
                $length = getLength($arr);

                // implementing bubble sort

                for($i = 0; $i < $length - 1; $i++)
                {
                    for($j = 0; $j < $length - $i - 1; $j++)
                    {
                        // sort in ascending order

                        if($arr[$j] > $arr[$j+1])
                        {
                            $temp = $arr[$j];

                            $arr[$j] = $arr[$j+1];

                            $arr[$j+1] = $temp;
                        }
                    }
                }

                return $arr;
            }

            function getLength($arr)
            {
                $length = 0;

                foreach($arr as $val)
                {
                    $length++;
                }

                return $length;
            }

            $sortedArray = sortArray(1, 5, 9, -2, 6, 8, -10, 80, 7, 12, 9, 2, 13, -14, 16, 0, 8, -3, -7, 77);

            echo"<div>";

                echo"<p id=msg>The Sorted Array in Ascending Order is as follows :-</p><br>";

                echo"<ol>";

                    $colors = Array("#fafa6e", "#e0f470", "#c7ed73", "#aee678", "#97dd7d", "#81d581", "#6bcc86", "#56c28a", "#42b98d", "#2eaf8f", "#18a48f", "#009a8f", "#00908d", "#008589", "#007b84", "#0c707d", "#196676", "#215c6d", "#275263", "#2a4858");

                    $i = 0;

                    foreach($sortedArray as $val)
                    {
                        echo'<li style="color:'.$colors[$i].'";>&nbsp;&nbsp;'.$val.'</li><br>';

                        $i++;

                        if($i == getLength($colors))
                        {
                            $i = 0;
                        }
                    }

                echo"</ol>";

            echo"</div>";
    ?>
</body>
</html>