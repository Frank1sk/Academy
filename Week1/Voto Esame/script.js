//Scrivi un programma che chieda all'utente di inserire il punteggio di un esame. Se il punteggio è maggiore o uguale a 90, stampa "A". Se è compreso tra 80 e 89, stampa "B". Se è compreso tra 70 e 79, stampa "C". Se è compreso tra 60 e 69, stampa "D". Altrimenti, stampa "F".
let punteggioStringa = prompt("Inserisci il punteggio dell'esame");
console.log(punteggioStringa);
let punteggio = parseInt(punteggioStringa); //Qui ho usato la funzione parseInt() per la conversione
console.log(punteggio);
switch(true){ //Necessario mettere true perchè quando analizza condizioni più complesse (come queste) di un singolo valore della variabile da esaminare, lo switch può avere problemi e va nel case default ogni volta.
    case (punteggio === 100):
        console.log("Voto: A con lode");
        break;
    case (punteggio >=90 && punteggio <= 99):
        console.log("Voto: A");
        break;
    case (punteggio >=80 && punteggio <= 89):
        console.log("Voto: B");
        break;
    case (punteggio >=70 && punteggio <= 79):
        console.log("Voto: C");
        break;
    case (punteggio >=60 && punteggio <= 69):
        console.log("Voto: D");
        break;
    default:
        console.log("Voto F");
}