// ESERCIZIO SU CALLBACK

/**
 *
 * Scrivere una funzione che accetti due parametri
 * - un nome
 * - una callback
 *
 * La funzione deve concatenare il nome che gli passiamo
 * con una stringa di saluto e passare il risultato
 * alla callback
 */

//Definizione della funzione callback
function callback(messaggio){
    console.log(messaggio)
}

//Definizione della funzione che chiama la callback
function chiamante(parametro, funzione){
    let stringa = "Forse ho capito le callback, " + parametro;
    funzione(stringa);
}

//Esecuzione
chiamante("Daje!", callback);
