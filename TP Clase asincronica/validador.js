
document.getElementById('registration-form').addEventListener('submit', function(event) {
      
    if(document.getElementById('username').value === "" || document.getElementById('password').value === "") {
        event.preventDefault();
        document.getElementById('error-message').style.display = 'block';
        alert("Por favor llena los valores de usuario y contraseña");
        return false;
    }
        
    if(document.getElementById('username').value.toLowerCase() === "admin") {
            
        event.preventDefault();
        document.getElementById('error-message').style.display = 'block';
        alert("El usuario no puede ser admin");
        return false;
    }

    if(document.getElementById('password').value === "1234" || document.getElementById('password').value.toLowerCase() === "admin") {
           
        event.preventDefault();
        document.getElementById('error-message').style.display = 'block';
        alert("Elegi otra contraseña, la tuya es muy insegura");
        return false;
    }
       
    document.getElementById('error-message').style.display = 'none';
    document.getElementById('success-message').style.display = 'block';
    alert("Registro Existoso");
    event.preventDefault();
    return false;
});
