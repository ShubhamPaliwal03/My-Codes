// 1. select everything that will be required
const input = document.querySelector("input");
const button = document.querySelector("button");
const taskList = document.querySelector(".list");

// 2. user intercation
const inputHandler = function () {
    // click -> value get
    const newTask = input.value.trim();
    if (newTask.length == 0)
        return;
    /*****addTask******/
    // element create 
    const taskElem = createTask(newTask);
    // append 
    taskList.appendChild(taskElem);
    // clear the input
    input.value = "";

    const deleteBtn = taskElem.children[1];

    deleteBtn.addEventListener("click", function () {
        taskElem.remove();
    })

    const edit_container = taskElem.children[2];
    const edit_btn = edit_container.children[0];

    console.log(edit_btn);

    edit_btn.addEventListener('click', function() {

        const edit_input_field = edit_container.children[1];

        if(edit_input_field.value.trim() != "") {

            const task_item = taskElem.children[0];
            task_item.innerText = edit_input_field.value.trim();
            edit_input_field.value = "";
        }
    });
}

function createTask(newTask) {
    const div = document.createElement("div");
    const li = document.createElement("li");
    const button = document.createElement("button");
    button.innerText = "Delete";
    li.textContent = newTask;

    const edit_container = document.createElement("div");
    const edit_btn = document.createElement("button");
    edit_btn.innerText = "Edit";
    const edit_input_field = document.createElement("input");
    edit_input_field.type = "text";
    edit_input_field.placeholder = "Edit your task...";
    edit_container.appendChild(edit_btn);
    edit_container.appendChild(edit_input_field);

    div.appendChild(li);
    div.appendChild(button);
    div.appendChild(edit_container);

    return div;
}

button.addEventListener("click", inputHandler);

// const secondBtn = document.querySelector(".second");

// secondBtn.addEventListener("click", function () {
//     const name = prompt("What is your name");
//     console.log("name", name);
// })