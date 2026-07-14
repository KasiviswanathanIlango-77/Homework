/**
 * Represents a person.
 * @class
 */
class Person {
    /*
     * @param {string} name - The name of the person.
     * @param {number} age - The age of the person.
     */
    constructor(name, age) {
        /**
         * The name of the person.
         * @type {string}
         */
        this.name = name;

        /**
         * The age of the person.
         * @type {number}
         */
        this.age = age;
    }

    /**
     * Prints a greeting message.
     * @returns {void}
     */
    greet() {
        console.log(`Hello, my name is ${this.name} and I am ${this.age} years old`);
    }
}

const person1 = new Person("kasi", 29);


person1.greet();