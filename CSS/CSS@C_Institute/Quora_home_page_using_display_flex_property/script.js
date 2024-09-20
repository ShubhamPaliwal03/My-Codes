let prev_active_page_btn_id = "home_btn"

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