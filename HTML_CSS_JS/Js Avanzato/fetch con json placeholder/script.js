//TEORIA Fetch con JSON placeholder

document.addEventListener("DOMContentLoaded", function () {
  const url = "https://jsonplaceholder.typicode.com/users";

  //Questa è la fetch
  fetch(url)
    .then((response) => response.json())
    .then((utenti) => {
      const utentiDiv = document.getElementById("utenti");
      utenti.forEach((utente) => {
        const utenteCard = document.createElement("div");
        utenteCard.classList.add("banana");
        utenteCard.innerHTML = `
      <h2>${utente.name}</h2>
      <p>Username: ${utente.username}</p>
      <p>Email: ${utente.email}</p>
      <br><br>
      `;
        utentiDiv.appendChild(utenteCard);
      });
    })
    .catch((error) => console.error("Errore:", error));
});
