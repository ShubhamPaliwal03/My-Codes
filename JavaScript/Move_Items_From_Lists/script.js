const move_btn = document.getElementById('move-btn');
const clear_btn = document.getElementById('clear-btn');
const del_btn = document.getElementById('del-btn');

const selectElem1 = document.getElementById('list1');
const selectElem2 = document.getElementById('list2');

move_btn.addEventListener('click', () => {

    function checkIfAlreadyExists(selectedValue) {

        const list2Options = document.querySelectorAll('#list2 > option');

        for (let option of list2Options) {

            if (option.value === selectedValue) {

                return true;
            }
        }

        return false;
    }

    const selectedValue = selectElem1.value;

    if (selectedValue !== "") {

        if (checkIfAlreadyExists(selectedValue)) {

            alert("Can't Move! Selected value already exists in list 2!");
        }
        else {

            const optionElem = document.createElement('option');
            optionElem.value = selectedValue;
            optionElem.innerText = selectedValue;
    
            selectElem2.appendChild(optionElem);
        }

    } else {

        alert('Nothing to move from list 1!');
    }
});

del_btn.addEventListener('click', () => {

    const selectedValue = selectElem1.value;

    if (selectedValue !== "") {

        const selectedOption = document.querySelector(`#list1 > option[value='${selectedValue}']`);

        selectElem1.removeChild(selectedOption);

    } else {

        alert('Nothing to delete from list 1!');
    }
});

clear_btn.addEventListener('click', () => {

    const options = document.querySelectorAll(`#list2 > option`); // returns a NodeList of elements matching the query

    console.log(options)

    if (options.length === 0) {

        alert('Nothing to clear from list 2!');
    }
    else {
        
        for (let option of options) {

            selectElem2.removeChild(option);
        }
    }
});

function renderList(selectElemId, options) {
    
    const selectElem = document.getElementById(selectElemId);
    
    for (let option of options) {
        
        const optionElem = document.createElement('option');
        optionElem.value = option;
        optionElem.innerText = option;
        
        selectElem.appendChild(optionElem);
    }
}

const options1 = ['India', 'USA', 'UAE', 'Sri Lanka', 'UK', 'Nepal', 'France', 'Russia', 'Ukraine', 'Turkey']

renderList('list1', options1)