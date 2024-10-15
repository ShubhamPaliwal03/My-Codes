<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Function With Default Args To Draw Form</title>
    <style>
        #errorMsg
        {
            color: red;
        }
        #form_outer
        {
            border: solid 1px black;
            outline: solid 1px red;
            /* width : 50%; */
            /* margin: 0px auto; // top bottom, left, right */
            padding: 35px;
        }
        body
        {
            display: flex;
            align-items: center;
            justify-content: center;
        }
    </style>
</head>
<body>
    <?php
        function drawForm($labels = 3, $input = 3, $type = "text")
        {
            if($labels !== $input)
            {
                echo'<p id="errorMsg">Number of labels and input fields should be equal!<p>';
            }
            else if($type !== "text" && $type !== "password" && $type !== "email" && $type !== "number")
            {
                echo'<p id="errorMsg">Incompatibe Input Type!</p>';
            }
            else
            {
                ?>
                <div id="form_outer">
                    <form>
                            <?php
                                for($i = 1; $i <= $input; $i++)
                                {
                                    echo'<label>label'.$i.'&nbsp;<input type="'.$type.'"></label><br><br>';
                                }
                            ?>
                        <input type="submit" value="Submit">
                    </form>
                </div><br>
                <?php
            }     
        }

        drawForm();
        // drawForm(2);
        // drawForm(3);
        // drawForm(2, 2);
        // drawForm(2, 2, "number");
        // drawForm(3, 3, "password");
        // drawForm(2, 2, "email");
        // drawForm(2, 2, "text");
    ?>
</body>
</html>