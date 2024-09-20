$(document).ready(() => {
    alert('Click On The Screen To Throw Colorful Balloon Splashes ! 🎈🔫')
})

const dholSound = new Audio('sounds/dhol-sound.mp3');

const dholImage = document.createElement('img');

dholImage.src = 'images/dhol.gif';

dholImage.id = "dhol-image";

const confetti_button = document.getElementsByClassName("confetti-button")[0];

confetti_button.addEventListener("click", (event) => {

    event.stopPropagation(); // to prevent event bubbling

    confetti_button.remove()

    body.appendChild(dholImage)

    dholSound.play()

    // When dispatched in a tree, invoking this method prevents event from reaching any objects other than the current object.

    var end = Date.now() + (15 * 500);

    var colors = ['#0007fff', '#ff1493'];

    (function frame() {
        confetti({
            particleCount: 2, // 7
            angle: 80, // 60
            spread: 20, // 55
            origin: { x: 0 },
            colors: colors
        });
        confetti({
            particleCount: 2, // 7
            angle: 100, // 120
            spread: 20, // 55
            origin: { x: 1 },
            colors: colors
        });

        if (Date.now() < end) {
            requestAnimationFrame(frame);
        }
        else // if (Date.now() >= end)
        {
            dholImage.remove()
            body.appendChild(confetti_button)
        }

    }());
});