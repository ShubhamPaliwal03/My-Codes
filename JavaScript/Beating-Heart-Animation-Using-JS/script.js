const heart_img = document.getElementById('heart_img');
let state = "still";
let intervalId;
let scale = "1";

heart_img.addEventListener('click', () => {
    if(state === "still"){
        intervalId = setInterval(() => {
            if(scale === "1"){
                heart_img.style.scale = "1.2";
                scale = "1.2";
            }
            else{
                heart_img.style.scale = "1";
                scale = "1";
            }
        }, 1200); // 'cause an actual human heart beats at 1.2 bps (72 bpm) ;)
        state = "beating";
    }
    else{
        clearInterval(intervalId);
        heart_img.style.scale = "1";
        scale = "1";
        state = "still";
    }
});