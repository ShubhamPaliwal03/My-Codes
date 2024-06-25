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
const post_pop_up_inner_container = document.getElementById('post-pop-up-inner-container');
const post_pop_up_create_post_btn = document.getElementById('post-pop-up-create-post-btn');
const cancel_btn = document.getElementById('cancel-btn');
const post_content_textarea = document.getElementById('post-content-textarea');
const post_title_input = document.getElementById('post-title-input');
let isClickedFromSearchSection = false;

post_btn.addEventListener('click', () => {

    app_container.style.position = "fixed";
    post_pop_up_outer_container.style.display = "flex";
});

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

const checkIfTextInputEmpty = () => {

    if(post_title_input.value === "") {

        post_pop_up_create_post_btn.disabled = true;
    }
    else {

        post_pop_up_create_post_btn.disabled = false;
    }
};

post_title_input.addEventListener('focus', checkIfTextInputEmpty);
post_title_input.addEventListener('blur', checkIfTextInputEmpty);

cancel_btn.addEventListener('click', () => {

    app_container.style.position = "static";
    post_pop_up_outer_container.style.display = "none";
});

post_pop_up_create_post_btn.addEventListener('mouseover', () => {

    if(post_content_textarea.value === "" || post_title_input.value === "") {

        post_pop_up_create_post_btn.disabled = true;
    }
    else {

        post_pop_up_create_post_btn.disabled = false;
    }
});

const user_post_search_box = document.getElementById('user-post-search-box');
const searchbar_results = document.getElementById('searchbar-results');
const search_string = document.querySelector("#search-string-showcase > .search-string");

const hideResultDropDown = () => {

    searchbar_results.style.display = "none";
    post_pop_up_outer_container.style.display = "none";
    post_pop_up_inner_container.style.display = "block";
    post_pop_up_inner_container.style.display = "block";
    app_container.style.display = "static";
};

const showResultDropDown = () => {

    searchbar_results.style.display = "block";
    post_pop_up_outer_container.style.display = "flex";
    post_pop_up_inner_container.style.display = "none";
    app_container.style.display = "fixed";
    search_string.innerText = user_post_search_box.value;
};

const toggleResultDropDown = () => {
    
    if(user_post_search_box.value === "") {

        hideResultDropDown();
    }
    else {

        showResultDropDown();
    }
};

user_post_search_box.addEventListener('input', toggleResultDropDown);

user_post_search_box.addEventListener('focus', () => {

    showResultDropDown();
});

user_post_search_box.addEventListener('blur', () => {

    if(!isClickedFromSearchSection) {
        
        hideResultDropDown();
    }
});

searchbar_results.addEventListener('mouseover', () => {

    isClickedFromSearchSection = true;
});

searchbar_results.addEventListener('mouseleave', () => {

    isClickedFromSearchSection = false;
});