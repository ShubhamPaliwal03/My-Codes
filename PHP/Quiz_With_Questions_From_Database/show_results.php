<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Quiz - Results</title>
    <link rel="stylesheet" href="./show_results_style.css">
</head>
<body>
<?php
    if(isset($_GET['iotkmopks']) && isset($_COOKIE['score']))
    {
        $value = $_GET['iotkmopks'];
        $total_questions = substr($value, 0, strlen($value) - 5);

        ?>
            <div class="column-flex-container">
                <h1>Quiz Completed!</h1>
                <h2 style="color: rgb(9, 191, 9);">Your Score is : <?php echo($_COOKIE['score']);?> / <?php echo($total_questions); ?></h2>
            </div>
        <?php
    }
    else
    {
        echo("<h1>Access Denied...Request From Unknown Source...</h1>");
    }
?>  
</body>
</html>