const prompt = require("prompt-sync")();
function calculateGrade(marks) {
    if (marks >= 90) {
        return "A+";
    }

    else if (marks >= 75) {
        return "A";
    }
    else if (marks >= 60) {
        return "B";
    }
    else if (marks >= 50) {
        return "C";
    }
    else {
        return "fail";
    }
}
let marks=Number(prompt("Enter Mark: "));
console.log("Grade : ",calculateGrade(marks));