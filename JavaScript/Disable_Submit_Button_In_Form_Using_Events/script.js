const name_fields = document.getElementsByClassName('name');
const submit_btn = document.querySelector('input[type=submit]');
console.log(submit_btn)

const checkIfOnlyAlphaSpace = (string) => 
{
    if (string === "")
    {
        return false;
    }

    for (const char of string)
    {
        if (!(char >= 'a' && char <= 'z' || char === ' '))
        {
            return false;
        }
    }

    return true;
};

for (const name_field of name_fields)
{
    name_field.addEventListener('input', () => 

        {
            if (!(checkIfOnlyAlphaSpace(name_fields[0].value.toLowerCase()) && checkIfOnlyAlphaSpace(name_fields[1].value.toLowerCase())))
            {
                submit_btn.disabled = true;
            }
            else
            {
                submit_btn.disabled = false;
            }
        }
    );   
}