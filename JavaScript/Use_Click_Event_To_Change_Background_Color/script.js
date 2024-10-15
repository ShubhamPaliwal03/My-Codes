const colorSelectors = document.querySelectorAll(".color-pallete > .color");
const body = document.querySelector("body");

for (const colorSelector of colorSelectors) {
    
    colorSelector.addEventListener('click', (event) => {

        body.style.backgroundColor = window.getComputedStyle(event.target).getPropertyValue("background-color");
    });
}

const colorPicker = document.getElementById('color-picker');

colorPicker.addEventListener('click', (event) => {

    body.style.backgroundColor = event.target.value;
});

colorPicker.addEventListener('change', (event) => {

    body.style.backgroundColor = event.target.value;
});