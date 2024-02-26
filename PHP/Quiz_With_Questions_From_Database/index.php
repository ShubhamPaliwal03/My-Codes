<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Programming Quiz - Check Your Knowledge</title>
    <style type="text/css">
        body
        {
            background-color: #1e2124;
            color: white;
        }
        #nextBtn
        {
            display: inline-block;
            padding: 5px;
            text-align: center;
            height: 20px;
            line-height: 18px;
            font-size: 1.1em;
            font-weight: 700;
            text-decoration: none;
            outline: none;
            box-sizing: border-box;
        }
        #hidden_answer
        {
            display: none;
        }
        #show_or_hide_btn
        {
            display: inline-block;
            color: orange;
            font-weight: 900;
            font-size: 1.1em;
            cursor: pointer;
        }
        label
        {
            cursor: pointer;
        }
        .options
        {
            padding: 10px;
            height: 20px;
            width: 600px;
            border: solid 1px grey;
            border-radius: 10px;
        }
        .options:hover
        {
            border-color: white;
        }
        #submit_button
        {

        }
    </style>
</head>
<body>
    <?php

        $rec_num = 0;

        if(isset($_GET['rec_num']))
        {
            $rec_num = $_GET['rec_num'];
        }

        $servername = "localhost";
        $username = "root";
        $password = "";
        $dbname = "quiz_application";

        $conn = mysqli_connect($servername, $username, $password, $dbname);
        
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

            Q.<?php echo ($rec_num+1)." ".$data['ques'];?>
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
            <a id="nextBtn" href="index.php?rec_num=<?php echo $rec_num;?>">Next</a>

            <span id="show_or_hide_btn">Show</span>

            <input type="button" id="submit_question_button" onclick="validateAnswer()" value="Submit Question">

            <div id="hidden_answer">
                Correct Answer : <?php echo $data['answer'];?>
                <br>
                Explanation : <?php echo $data['explanation'];?>
            </div>

            <script>

                const show_or_hide_btn = document.getElementById('show_or_hide_btn');

                show_or_hide_btn.addEventListener('click', showOrHide);

                function showOrHide()
                {
                    const hiddenAnswer = document.getElementById('hidden_answer');

                    if(show_or_hide_btn.innerHTML == "Show") // if the answer is hidden
                    {
                        hiddenAnswer.style.display = "block";

                        show_or_hide_btn.innerHTML = "Hide";
                    }
                    else // if the answer is visible / shown
                    {
                        hiddenAnswer.style.display = "none";

                        show_or_hide_btn.innerHTML = "Show";
                    }
                }

                let last_selected_option_id = "";

                function highlightSection(id)
                {
                    if(last_selected_option_id !== "")
                    {
                        const prev_selected_option_container = document.getElementById("border_container"+last_selected_option_id);

                        prev_selected_option_container.style.borderColor = "grey";
                    }

                    const section = document.getElementById("border_container"+id);

                    section.style.borderColor = "white";

                    last_selected_option_id = id;
                }

                let last_submitted_answer_id = "";

                function validateAnswer()
                {
                    if(last_submitted_answer_id !== "")
                    {
                        const prev_selected_option_container = document.getElementById("border_container"+last_submitted_answer_id);

                        prev_selected_option_container.style.borderColor = "grey";

                        prev_selected_option_container.style.color = "white";
                    }

                    const correct_answer = document.getElementById('correct_answer').value;

                    const user_selected_option_container = document.getElementById("border_container"+last_selected_option_id);

                    const user_selected_answer = last_selected_option_id.substring(1);

                    if(correct_answer === user_selected_answer)
                    {
                        user_selected_option_container.style.borderColor = "green";

                        user_selected_option_container.style.color = "green";
                    }
                    else
                    {
                        user_selected_option_container.style.borderColor = "red";

                        user_selected_option_container.style.color = "red";
                    }

                    last_submitted_answer_id = last_selected_option_id;
                }

            </script>

            <?php
        }
        else
        {
            echo "<p>Quiz Completed...</p>";
        }
    ?>
</body>
</html>