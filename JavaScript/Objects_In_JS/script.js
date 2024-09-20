// create a simple object to represnt a Student
// create a method for getting full name

const s1 = {

    firstName: 'Shubham',
    lastName: 'Paliwal',
    email: 'shubhampaliwal.dev@gmail.com',
    age: '21',
    getFullName: function () {

        return this.firstName + " " + this.lastName;
    }
};

console.log(s1.getFullName());

// create a music system object (Volumne, Company Name, Model Name)

const musicSystem = {

    companyName: 'Bose',
    modelName: 'SoundXtreme',
    RMSWattage: '4000'
};

const car = {

    companyName: 'Volkswagen',
    modelName: 'Virtus GT',
    trim: 'GT 1.5 Manual',
    color: 'Cherry Red',
    musicSystem: musicSystem, // nesting of objects
    exShowroomPrice: 2150000
};

// Access the follwing properties :-

// 1. company name of the car
// 2. company name of the music system that is present in the car
// 3. ex-showroom price of the car
// 4. model name of the music system that is contained in the car

console.log("Company name of the car :", car.companyName);
console.log("Company name of the music system that is present in the car :", car.musicSystem.companyName);
console.log("Ex-showroom price of the car :", car.exShowroomPrice);
console.log("Model name of the music system that is contained in the car :", car.musicSystem.modelName);