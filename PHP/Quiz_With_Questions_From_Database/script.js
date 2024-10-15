function changeText()
{
    const show_or_hide_btn = document.getElementById('show_or_hide_btn');

    if(show_or_hide_btn.innerText === "Show Answer") // if the answer is hidden
    {   
        show_or_hide_btn.innerText = "Hide Answer";
    }
    else // if the answer is visible / shown
    {
        show_or_hide_btn.innerText = "Show Answer";
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

function validateAnswer(event)
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

        jQuery.ajax({
            
            url: 'update_score.php',
            method: 'post',
            data: 'passkey=108',
            success: (result) => {
                console.log(result);
            },
            error: (xhr, status, error) => {
                console.log(error);
            }
        });
    }
    else
    {
        user_selected_option_container.style.borderColor = "red";

        user_selected_option_container.style.color = "red";
    }

    last_submitted_answer_id = last_selected_option_id;

    event.target.disabled = true;
}

const confirmSubmit = () => {

    if(confirm("Are you sure you want to submit this Quiz ?")) {

        document.getElementById("submit-quiz-submit-button").click();
    }
};