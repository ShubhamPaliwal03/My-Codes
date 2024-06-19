let prev_active_page_btn_id = "home_btn";

function changeFontColor(current_active_page_btn_id) {

    if(current_active_page_btn_id !== prev_active_page_btn_id) {
        
            // fetch the current active page btn
            
            const current_active_page_btn = document.getElementById(current_active_page_btn_id);
        
            // change the color of the current active page button to shade of red (#b92b27)
        
            current_active_page_btn.style.color = "#b92b27";
        
            // fetch the prev active page btn
            
            const prev_active_page_btn = document.getElementById(prev_active_page_btn_id);
            
            // change the color of the previous active button back to shade of black again
        
            prev_active_page_btn.style.color = "rgba(0, 0, 0, 0.705)";
        
            // the current active page btn id will be the previous active page btn id for the next current active page btn
        
            prev_active_page_btn_id = current_active_page_btn_id;
    }
}

const post_btn = document.getElementById('create-post-btn');
const app_container = document.getElementById('app-container');
const post_pop_up_outer_container = document.getElementById('post-pop-up-outer-container');
const post_pop_up_create_post_btn = document.getElementById('post-pop-up-create-post-btn');
const cancel_btn = document.getElementById('cancel-btn');

post_btn.addEventListener('click', () => {

    app_container.style.position = "fixed";
    post_pop_up_outer_container.style.display = "flex";
});

const post_content_textarea = document.getElementById('post-content-textarea');

const checkIfTextAreaEmpty = () => {

    if(post_content_textarea.value === "") {

        post_pop_up_create_post_btn.disabled = true;
    }
    else {

        post_pop_up_create_post_btn.disabled = false;
    }
};

post_content_textarea.addEventListener('focus', checkIfTextAreaEmpty);
post_content_textarea.addEventListener('blur', checkIfTextAreaEmpty);

cancel_btn.addEventListener('click', () => {

    app_container.style.position = "static";
    post_pop_up_outer_container.style.display = "none";
});

post_pop_up_create_post_btn.addEventListener('mouseover', () => {

    if(post_content_textarea.value === "") {

        post_pop_up_create_post_btn.disabled = true;
    }
    else {

        post_pop_up_create_post_btn.disabled = false;
    }
});

post_pop_up_create_post_btn.addEventListener('click', () => {

    new Audio('../sounds/post_success.mp3').play();
});