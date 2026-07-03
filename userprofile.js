function createUserProfile(firstName, lastName, email) {
    
    const user = {
        firstName: firstName,
        lastName: lastName,
        email: email
    };

    
    const fullName = `${user.firstName} ${user.lastName}`.toUpperCase();

    
    const domain = user.email.split("@")[1];

    
    return `PROFILE: ${fullName} | Email Domain: ${domain}`;
}


console.log(createUserProfile("Chandra", "Bose", "chan.bose@example.com"));


console.log(createUserProfile("Karunai", "Kamaraj", "karunai.kamaraj@gmail.com"));


console.log(createUserProfile("Vanji", "Nathan", "vanji.nathan@yahoo.co.in"));
