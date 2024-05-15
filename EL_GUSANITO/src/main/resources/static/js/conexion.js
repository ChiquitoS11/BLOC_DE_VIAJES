document.addEventListener('DOMContentLoaded', function() {
    document.querySelector('.sign-up-container form').addEventListener('submit', handleSignUp);
  
    function handleSignUp(event) {
      event.preventDefault();
      
      const usuario = document.querySelector('.sign-up-container input[placeholder="Usuario"]').value;
      const nombre = document.querySelector('.sign-up-container input[placeholder="Nombre"]').value;
      const contraseña = document.querySelector('.sign-up-container input[placeholder="Contraseña"]').value;
  
      if (usuario && nombre && contraseña) {
        const data = {
          usuario: usuario,
          nombre: nombre,
          contraseña: contraseña
        };
  
        fetch('/register', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json'
          },
          body: JSON.stringify(data)
        })
        .then(response => response.json())
        .then(data => {
          if (data.success) {
            alert('Registro exitoso');
          } else {
            alert('Error en el registro: ' + data.message);
          }
        })
        .catch((error) => {
          console.error('Error:', error);
        });
      } else {
        alert('Por favor completa todos los campos');
      }
    }
  });