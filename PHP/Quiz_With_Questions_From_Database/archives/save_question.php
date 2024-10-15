<?php
    if(isset($_POST['submit']))
    {   
        include('./connect.php');

        $sql = "insert into 'questions' () values ";
    }
    else
    {
        echo('Request from unknown source...');
    }
?>