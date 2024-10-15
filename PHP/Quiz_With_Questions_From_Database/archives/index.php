<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./style.css">
    <title>Programming Quiz - Check Your Knowledge</title>
</head>
<body>
    <?php
        $rec_num = 0;

        if(isset($_GET['rec_num']))
        {
            $rec_num = $_GET['rec_num'];
        }
        else
        {
            // reset the score cookie for a new quiz

            setcookie("score", 0, time()+60*60);
        }

        include('./connect.php');
        
        $result = mysqli_fetch_assoc(mysqli_query($conn, "select COUNT(ques) as total from questions"));

        $count = $result['total'];

        if($rec_num <= $count)
        {
            $sql = "select * from questions limit $rec_num, 1"; // fetches 1 record at a time from the database
    
            $record = mysqli_query($conn, $sql);
            
            $data = mysqli_fetch_assoc($record);
        }

        if($rec_num !== $count)
        {
            ?>
            <div class="column-flex-container">
                <h2>Q.<?php echo ($rec_num+1)." ".$data['ques'];?></h2>
                <br><br><br>
                <label id="_a" onclick="highlightSection(this.id)">
                    <div class="options" id="border_container_a">
                        <input type="radio" name="answer" value="<?php echo $data['a'];?>">
                        <?php echo $data['a'];?>
                    </div>
                </label>
                <br><br>
                <label id="_b" onclick="highlightSection(this.id)">
                    <div class="options" id="border_container_b">
                        <input type="radio" name="answer" id="b" value="<?php echo $data['b'];?>">
                        <?php echo $data['b'];?>
                    </div>
                </label>
                <br><br>
                <label id="_c" onclick="highlightSection(this.id)">
                    <div class="options" id="border_container_c">
                        <input type="radio" name="answer" id="c" value="<?php echo $data['c'];?>">
                        <?php echo $data['c'];?>
                    </div>
                </label>
                <br><br>
                <label id="_d" onclick="highlightSection(this.id)">
                    <div class="options" id="border_container_d">
                        <input type="radio" name="answer" id="d" value="<?php echo $data['d'];?>">
                        <?php echo $data['d'];?>
                    </div>
                </label>

                <?php $rec_num++; ?>

                <input type="hidden" id="correct_answer" name="correct_answer" value="<?php echo $data['answer'];?>">
                <br><br>
                <div class="buttons-container row-flex-container">
                    <input type="button" id="submit_answer_button" onclick="validateAnswer()" value="Submit Answer">
                    <a id="nextBtn" href="index.php?rec_num=<?php echo $rec_num;?>">
                        Next
                    </a>
                </div>
                <input type="button" id="show_or_hide_btn" value="Show Answer">
                <div id="hidden_answer">
                    Correct Answer : <?php echo $data['answer'];?>
                    <br>
                    Explanation : <?php echo $data['explanation'];?>
                </div>
            </div>
            <?php
        }
        else
        {   ?>
                <div class="column-flex-container">
                    <h1>Quiz Completed!</h1>
                    <h2 style="color: rgb(9, 191, 9);">Your Score is : <?php echo($_COOKIE['score']);?> / <?php echo($count); ?></h2>
                </div>
            <?php
        }
    ?>
    <script type="text/javascript" src="./script.js"></script>
    <script type="text/javascript" src="./jquery.js"></script>
    <script>
        // Using JQuery's toggle() function to show/hide the text

        $(document).ready(() => {

        $('#show_or_hide_btn').click(() => {
                
                $('#hidden_answer').toggle(500);

                changeText(); // present in script.js
            }
        )});
    </script>
</body>
</html>