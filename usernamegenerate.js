function generateUsername(name, phoneNumber) {
    
    const namePart = name.slice(0, 3).toLowerCase();
    
    
    const phonePart = String(phoneNumber).slice(-2);
    
    
    const username = namePart + phonePart;
    
    return username;
}


const name = "kasiviswanathan";
const phoneNumber = "9876543210";

const username = generateUsername(name, phoneNumber);
console.log("Generated Username:", username);  

console.log("Generated Username:",generateUsername("Alexander", "5551234567"));  
console.log("Generated Username:",generateUsername("Lakshmi", "9998887776"));      
console.log("Generated Username:",generateUsername("Kamatchi", "1112223334"));    
console.log("Generated Username:",generateUsername("Ilango", "4445556689"));       