const names = Array.from(document.getElementsByClassName('name'));

for(const name of names) {

    name.addEventListener('input', () => {
        
        name.value = name.value.toUpperCase();
    })
}

const phoneInputField = document.getElementsByClassName('phone-number')[0];
const phonePromptArea = document.getElementsByClassName('prompt-area')[0];

phoneInputField.addEventListener('input', () => {

    let isOutOfRange = phoneInputField.value.length > 10;
    let isNotOnlyDigits = phoneInputField.value.search(`^[0-9]{${phoneInputField.value.length}}$`) === -1;
    // console.log(`^[0-9]{${phoneInputField.value.length}}$`);

    if(isOutOfRange) {

        phonePromptArea.innerText = "Mobile Number can't have more than 10 digits!";
    }

    if (isNotOnlyDigits) {

        phonePromptArea.innerText = "Mobile Number can only contain digits!";
    }

    if (!isOutOfRange && !isNotOnlyDigits) {

        phonePromptArea.innerText = "";
    }
});

phoneInputField.addEventListener('change', () => {

    phonePromptArea.innerText = "Mobile Number should have exactly 10 digits!";
});