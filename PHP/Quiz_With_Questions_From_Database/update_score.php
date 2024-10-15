<?php
    if(isset($_POST['passkey']) && $_POST['passkey'] == 108)
    {
        $current_score = $_COOKIE['score'];

        setcookie("score", $current_score + 1, time()+60*60);

        echo("score updated...current score : $_COOKIE[score]");
    }
    else
    {
        echo("<h1>Access Denied...Request from Unknown Source...</h1>");
    }
?>