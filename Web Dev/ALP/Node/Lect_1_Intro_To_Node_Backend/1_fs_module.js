// fs module is used to do anything possible with files and folders

const fs = require('fs');

// ******* operations on files *******

// write into file

let filePath = "file.txt";
let content = "This content is added through Node JS";

// syncronous version

// console.log("Adding content to file...");
// fs.writeFileSync(filePath, content);
// console.log("Added content to file...");

// asyncronous version

// console.log("Before...");

// fs.writeFile(filePath, content, function(err, data) {

//     if (err) {

//         console.log("Oops! Something went wrong...");
//     }
//     else {

//         console.log("File written successfully...");
//     }
// });

// console.log("After...");

// read the contents of file

const fileContent = fs.readFileSync(filePath);
console.log(`Contents of file '${filePath}' : ${fileContent}`);

// update the contents of the file

// fs.appendFileSync(filePath, "\nHi There, My Name is Shubham!");

// ******* operations on folders *******

let folderPath = "dummy_folder";

// create a new folder

console.log(`Creating new folder - ${folderPath}...`);
fs.mkdirSync(folderPath);
console.log(`Created new folder - ${folderPath}...`);

// deleting a folder

setTimeout(() => {

    console.log(`Deleting folder - ${folderPath}`);
    fs.rmdirSync(folderPath);
    console.log(`Deleted folder - ${folderPath}`);

}, 2000);