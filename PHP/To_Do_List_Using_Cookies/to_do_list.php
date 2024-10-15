<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>To Do List</title>
</head>
<body>
    <h2>Add Task</h2>
    <form action="add_tasks.php" method="post">
        <input type="text" name="task">
        <input type="submit" name="add_task" value="Add">
        &nbsp;<a href="clear_tasks.php">Clear Tasks</a>
        <br>
    </form>
    <br>
    <hr>
    <h2>To Do List For Today</h2>
    <?php
        if(isset($_COOKIE['tasks']))
        {
            // fetch the $_COOKIE['tasks]

            $tasks = $_COOKIE['tasks'];

            // split the tasks into array

            // explode() splits a string into an array of strings

            $tasksArray = explode("|", $tasks);

            // show them in an ordered list

            echo "<ol>";

                foreach($tasksArray as $key => $value)
                {
                    echo"<li>$value</li>";
                }

            echo "</ol>";
        }
    ?>
</body>
</html>