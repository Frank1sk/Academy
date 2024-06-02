// Scrivi un programma che chieda all'utente di inserire la sua età. Se l'età è maggiore o uguale a 18, stampa "Puoi votare". Altrimenti, stampa "Non puoi votare".
let etaStringa = prompt("Inserisci la tua età"); //prompt() permette all'utente di inserire input...
let eta = Number(etaStringa); //...che sarà SEMPRE una stringa e quindi va convertito in un numero in questo caso. Operazione fatta dalla funzione Number()
if(eta >= 18){
    console.log("Puoi votare");
}else if(eta <= 0){
    console.log("Non puoi avere un età negativa!");
}else{
    console.log("Non puoi votare"); 
}