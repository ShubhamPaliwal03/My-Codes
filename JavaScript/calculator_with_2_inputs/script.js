function isNumber(value)
{
    for(let x of value)
    {
        if(x !== '0' && x !== '1' && x !== '2' && x !== '3' && x !== '4' && x !== '5' && x !== '6' && x !== '7' && x !== '8' && x !== '9')
        {
            return false
        }
    }

    return true
}

// you can also use isNaN() function here, which takes a string as a parameter, and returns true if it is not a number,
// it returns true if it is a number

function getResult(operation)
{
    const num1 = document.getElementById('num1').value

    const num2 = document.getElementById('num2').value
    
    let result = document.getElementById('result')

    if(!isNumber(num1) || !isNumber(num2))
    {
        result.value = "Type Error"

        result.style.color = "red"
    }
    else
    {
        result.style.color = "black"

        switch(operation)
        {
            case "+":
    
                result.value = Number(num1) + Number(num2)
    
                break
    
            case "-":
    
                result.value = Number(num1) - Number(num2)
    
                break
    
            case "*":
    
                result.value = Number(num1) * Number(num2)
    
                break
    
            case "/":
    
                result.value = Number(num1) / Number(num2)
    
                break
        }
    }
}