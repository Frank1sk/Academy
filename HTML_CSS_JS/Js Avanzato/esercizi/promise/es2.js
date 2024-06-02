// ESERCIZIO SU PROMISE

/**
 *
 * Scrivete una funzione "ottieniIDati" che restiutuirà
 * una promise.
 *
 * La promise (per motivi didattici) si deve "risolvere"
 * dopo 3.5s fornendo una stringa "Ok, dati ricevuti correttamente".
 *
 * Catturate il risultato e stampatelo in console.
 */


//Definizione
let ottieniDati = new Promise(function (resolve, reject) {
    setTimeout(() => {
        let risultato = "Ok, dati ricevuti correttamente";
        resolve(risultato);
    }, 3500);
});

//Chiamata
ottieniDati.then(function (risultato) {
     console.log("Fulfilled", risultato);
   }).catch(function (errore) {
     console.log("Rejected", errore);
   });