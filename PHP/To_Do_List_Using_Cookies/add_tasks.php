<?php

    if(isset($_POST['add_task']))
    {
        $task = $_POST['task'];

        if(!isset($_COOKIE['tasks']))
        {
            setcookie("tasks", $task, time()+60*60);
        }
        else
        {
            $tasks = $_COOKIE['tasks'];

            $tasks .= "|".$task;

            setcookie("tasks", $tasks, time()+60*60);
        }

        header("location:to_do_list.php");
    }

?>