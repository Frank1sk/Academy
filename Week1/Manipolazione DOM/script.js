// PUNTATORI
// Puntano ad un elemento in modi diversi
// Attraverso l'id:
// let elementoDaId = document.getElementById("element");
// Attraverso la classe:
// let elementoDallaClasse = document.getElementsByClassName("classe");
// Attraverso il tag:
// let elementoDaTag = document.getElementsByTagName("div");
// Attraverso un id e una classe (esempio), un id e un tag, una classe e un tag ecc...:
// let elementoDaQuery = document.querySelector("#id .classe");
// Attraverso una query che seleziona gli elementi appartenenti ad una classe specifica:
// let elentoDaQueryMultipla = document.querySelectorAll(".paperino");

// Modifica delle classi
// Aggiungere una classe ad un elemento:
// elementoDaId.classList.add("ciao");
// Rimuovere una classe da un elemento:
// elementoDaId.classList.remove("red");
// Rimuovere se c'è/aggiungere se non c'è una classe ad un elemento:
// elementoDaId.classList.toggle("classe");

// Modifica dello stile
// elementoDaId.style.backgroundColor = "black";

elementoDaId.addEventListener("click", function () {
  console.log("ciao");
  elementoDaId.classList.toggle("red");
});