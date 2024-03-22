const gameContainer = document.getElementById("game-container");
const scoreDisplay = document.getElementById("score");
const timeDisplay = document.getElementById("time");
const timeLimit = 30; // 30 seconds

let score = 0;
let timeLeft = timeLimit;

function createPumpkin() {
    const pumpkin = document.createElement("div");
    pumpkin.className = "pumpkin";
    pumpkin.addEventListener("click", () => {
        score++;
        scoreDisplay.innerText = score;
        gameContainer.removeChild(pumpkin);
    });

    gameContainer.appendChild(pumpkin);

    setTimeout(() => {
        gameContainer.removeChild(pumpkin);
    }, timeLimit * 1000);
}

function updateTimer() {
    timeDisplay.innerText = "Time: " + timeLeft + " seconds";
    timeLeft--;

    if (timeLeft < 0) {

        timeDisplay.innerText = "0 seconds"
        endGame();
    }
}

function endGame() {
    gameContainer.innerHTML = "<h2>Game Over!<br></h2>";
    gameContainer.innerHTML += "<h1>Your score: " + score + "</h1>";
    gameContainer.style.color = "green"
}

setInterval(createPumpkin, 1000);
setInterval(updateTimer, 1000);