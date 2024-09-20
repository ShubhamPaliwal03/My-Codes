document.write("<span id=btn1>"
+"<label id=b1><img src=dark-mode-icon.png id=modeIcon><input type=checkbox id=cb1></label>"
+"</span>")

// function display_message()
// {
//     console.log("click here to change color mode")
// }

let checkbox = document.getElementById("cb1")

let body = document.body // get the body object

let modeIcon = document.querySelector("#modeIcon")

checkbox.addEventListener("change", changeMode)

function changeMode()
{
	if(checkbox.checked)
	{
		body.className = "dark" // Returns the value of element's class content attribute. Can be set to change it.

        // changes the class of the body to "dark"
		
		modeIcon.src = "light-mode-icon.png"
	}
	else
	{	
		body.className = "light" // changes the class of the body to "light"
		
		modeIcon.src = "dark-mode-icon.png"
	}
}