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
        if(!isset($_POST['ques_number']))
        {
            // initialize the question number with 0

            $ques_number = 0;
        }
        else
        {
            $ques_number = $_POST['ques_number'];
        }

        if(!isset($_POST['prev_btn']) && !isset($_POST['next_btn']) && !isset($_POST['submit-quiz-btn']))
        {
            // reset the score cookie for a new quiz

            setcookie("score", 0, time()+60*60);
        }

        if(isset($_POST['prev_btn']))
        {
            $ques_number--;
        }
        else if(isset($_POST['next_btn']))
        {
            $ques_number++;
        }

        include('./connect.php');
        
        $result = mysqli_fetch_assoc(mysqli_query($conn, "select COUNT(ques) as total from questions"));

        $total_questions = $result['total'];

        if(isset($_POST['submit-quiz-btn']))
        {
            header("location:./show_results.php?dhuohfs=498846&qofdgdfa=95340&ispfkpfj=85984&hisdfgfg=29316&iotkmopks=$total_questions"."96108&lfsdfnbodf=046841&fddgdfgdf=126802&bdg=797130&rwtfxfds=896743");
        }
        else if($ques_number < $total_questions)
        {
            // fetch 1 record at a time from the database, starting from the given question number,
            // ie., it returns the details of a particular question_number 
            // (not in sync with ques_id of the questions table, because that is set to auto increment)

            $sql = "select * from questions limit $ques_number, 1";
            $record = mysqli_query($conn, $sql);
            $data = mysqli_fetch_assoc($record);

            ?>
            <div class="column-flex-container">
                <h2>Q.<?php echo ($ques_number+1)." ".$data['ques'];?></h2>
                <br><br><br>
                <label id="_a" onclick="highlightSection(this.id)">
                    <div class="options" id="border_container_a">
                        <input type="radio" name="answer" id="a" value="<?php echo $data['a'];?>">
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
                <input type="hidden" id="correct_answer" name="correct_answer" value="<?php echo $data['answer'];?>">
                <br><br>
                <form action="index.php" method="post">
                    <div class="buttons-container row-flex-container">
                        <input class="prev-next-btn" type="submit" value="Prev" name="prev_btn" <?php if($ques_number === 0) echo('disabled');?>>
                        <input type="button" id="submit_answer_button" onclick="validateAnswer(event)" value="Submit Answer">
                        <input type="submit" id="submit-quiz-submit-button" class="submit-quiz-button" name="submit-quiz-btn" value="Submit Quiz" hidden>
                        <?php 
                            if($ques_number === $total_questions - 1)
                            {
                                ?>
                                    <input type="button" id="submit-quiz-confirm-button" class="submit-quiz-button" value="Submit Quiz" onclick="confirmSubmit()">
                                <?php
                            }
                        ?>
                        <input class="prev-next-btn" type="submit" value="Next" name="next_btn" <?php if($ques_number === $total_questions - 1) echo('disabled');?>>
                        <input type="text" name="ques_number" value="<?php echo($ques_number);?>" hidden>
                    </div>
                </form>
                <input type="button" id="show_or_hide_btn" value="Show Answer">
                <div id="hidden_answer">
                    Correct Answer : <?php echo $data['answer'];?>
                    <br>
                    Explanation : <?php echo $data['explanation'];?>
                </div>
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