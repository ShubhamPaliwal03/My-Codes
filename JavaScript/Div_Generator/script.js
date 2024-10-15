const body = document.querySelector('body');

const addDivBtn = document.getElementById('add-div-btn');

addDivBtn.addEventListener('click', (e) => {

    // e.preventDefault(); // if you use a form

    const height = document.getElementById("height-field").value;
    const width = document.getElementById("width-field").value;
    const color = document.getElementById("color-field").value;
    const content = document.getElementById("content-field").value;

    const div = document.createElement('div');
    div.classList.add('created-div');

    div.style.height = `${height}px`;
    div.style.width = `${width}px`;
    div.style.color = color;
    div.innerText = content;
    div.style.border = `solid 1px ${color}`;

    body.appendChild(div);
});