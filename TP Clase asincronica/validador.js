// Add event listener to form submit event
document.getElementById('registration-form').addEventListener('submit', function(event) {
        // Check if both username and password fields are filled
    if(document.getElementById('username').value === "" || document.getElementById('password').value === "") {
            // If either field is empty, prevent form submission and show error message
        event.preventDefault();
        document.getElementById('error-message').style.display = 'block';
        alert("Por favor llena los valores de usuario y contraseña");
        return false;
    }
        // Check if username is "admin"
    if(document.getElementById('username').value.toLowerCase() === "admin") {
            // Prevent form submission and show error message
        event.preventDefault();
        document.getElementById('error-message').style.display = 'block';
        alert("El usuario no puede ser admin");
        return false;
    }

        // Check if password is "1234" or "admin"
    if(document.getElementById('password').value === "1234" || document.getElementById('password').value.toLowerCase() === "admin") {
            // Prevent form submission and show error message
        event.preventDefault();
        document.getElementById('error-message').style.display = 'block';
        alert("Elegi otra contraseña, la tuya es muy insegura");
        return false;
    }
        // If all validations pass, show success message and allow form submission
        
    document.getElementById('error-message').style.display = 'none';
    document.getElementById('success-message').style.display = 'block';
    alert("Registro Existoso");
    event.preventDefault();
    return false;
});

function sleep(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
}