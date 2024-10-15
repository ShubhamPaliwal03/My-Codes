const hours_hand = document.querySelector('.hours');
const minutes_hand = document.querySelector('.minutes');
const seconds_hand = document.querySelector('.seconds');

var intervalID;

const updateClock = () => {

        intervalID = setInterval(() => {

        const date = new Date();

        const hours = date.getHours();
        const mins = date.getMinutes();
        const secs = date.getSeconds();

        const hours_hand_rotation = (hours * (360 / 12)) + (mins / 2);
        const minutes_hand_rotation = (mins * (360 / 60)) + (secs / 10);
        const seconds_hand_rotation = secs * (360 / 60);

        hours_hand.style.transform = `rotate(${hours_hand_rotation}deg)`;
        minutes_hand.style.transform = `rotate(${minutes_hand_rotation}deg)`;
        seconds_hand.style.transform = `rotate(${seconds_hand_rotation}deg)`;

    }, 1000);
}

updateClock();

setTimeout(() => {

    clearInterval(intervalID);

}, 6000);