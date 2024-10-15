import React from 'react';
import InputBox from './InputBox';
import ListItem from './ListItem';
// import Input from './Input';

function Shopping() {

    const [content, setContent] = React.useState("");

    const [tasks, setTasks] = React.useState([]);

    const handleInput = (e) => {

        setContent(e.target.value);
    };

    const handleAddItem = () => {

        // input the value

        const newTask = content;

        // add the new item to tasks array

        const newTasksArray = [...tasks, newTask];

        setTasks(newTasksArray);

        setContent("");
    };

    const handleDelete = (target_index) => {

        const filteredTasks = tasks.filter((task, index) => {

            return index !== target_index;
        });

        setTasks(filteredTasks);
    };

    return (
        
        <div className="Shopping-list">
            <InputBox 
                handleInput={handleInput} handleAddItem={handleAddItem} content={content}>
            </InputBox>
            <ListItem 
                handleDelete={handleDelete} tasks={tasks}>
            </ListItem>
        </div>
    )
}

export default Shopping;