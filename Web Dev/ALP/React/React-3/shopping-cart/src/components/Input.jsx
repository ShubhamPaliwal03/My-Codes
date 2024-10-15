import React from 'react';

function Input() {

    const [content, setContent] = React.useState("");

    const handleAlert = () => {

        alert(content);
        setContent("");
    };

    const handleChange = (e) => {

        const updatedValue = e.target.value;
        setContent(updatedValue);
    };

    return (
        <div>
            <input type="text" value={content} onChange={handleChange}/>
            <button onClick={handleAlert}>Alert Content</button>
        </div>)
}


export default Input;