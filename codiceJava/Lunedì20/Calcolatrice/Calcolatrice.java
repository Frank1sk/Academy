/* Creare un sistema di menù che permetta, dopo aver scelto di procedere, di avere disponibili 4 operazioni matematiche a scelta su 2 addendi.
 * Queste operazioni devono riportare il risultato corretto e uno sbagliato con random().
 * All'uscita stampare quante e quali operazioni sono state eseguite.
*/
package codiceJava.Lunedì20.Calcolatrice;
import java.util.Scanner;

public class Calcolatrice {
    public static void main(String[] args) {
        Scanner scannerN = new Scanner(System.in);
        System.out.println("Benvenuto nella calcolatrice un pò strana");
        int sceltaOperazione, a, b;
        int numeroOperazioni = 0, numeroSomma = 0, numeroDifferenza = 0, numeroProdotto = 0, numeroQuoziente = 0;
        int somma, sommaSbagliata, differenza, differenzaSbagliata, prodotto, prodottoSbagliato, quozienteSbagliato;
        float quoziente;
        boolean flag = true;

        while(flag){
            System.out.println("Scegli l'operazione:\n1 - somma\n2 - differenza\n3 - prodotto\n4 - quoziente\nOppure premi 5 per uscire");
            sceltaOperazione = scannerN.nextInt();
            switch (sceltaOperazione) {
                case 1:
                    System.out.println("Inserisci il primo numero");
                    a = scannerN.nextInt();
                    System.out.println("Inserisci il secondo numero");
                    b = scannerN.nextInt();
                    somma = a + b;
                    sommaSbagliata = (int) (Math.random()*101);
                    numeroOperazioni++;
                    numeroSomma++;
                    System.out.println("La somma di " + a + " e " + b + " è: " + somma);
                    System.out.println("La somma sbagliata è: " + sommaSbagliata);
                    break;
                case 2:
                    System.out.println("Inserisci il primo numero");
                    a = scannerN.nextInt();
                    System.out.println("Inserisci il secondo numero");
                    b = scannerN.nextInt();
                    differenza = a - b;
                    differenzaSbagliata = (int) (Math.random()*101);
                    numeroOperazioni++;
                    numeroDifferenza++;
                    System.out.println("La differenza di " + a + " e " + b + " è: " + differenza);
                    System.out.println("La differenza sbagliata è: " + differenzaSbagliata);
                    break;
                case 3:
                    System.out.println("Inserisci il primo numero");
                    a = scannerN.nextInt();
                    System.out.println("Inserisci il secondo numero");
                    b = scannerN.nextInt();
                    prodotto = a * b;
                    prodottoSbagliato = (int) (Math.random()*101);
                    numeroOperazioni++;
                    numeroProdotto++;
                    System.out.println("Il prodotto di " + a + " e " + b + " è: " + prodotto);
                    System.out.println("Il prodotto sbagliato è: " + prodottoSbagliato);
                    break;
                case 4:
                    System.out.println("Inserisci il primo numero");
                    a = scannerN.nextInt();
                    System.out.println("Inserisci il secondo numero");
                    b = scannerN.nextInt();
                    quoziente = a / b;
                    quozienteSbagliato = (int) (Math.random()*101);
                    numeroOperazioni++;
                    numeroQuoziente++;
                    System.out.println("Il quoziente di " + a + " e " + b + " è: " + quoziente);
                    System.out.println("La quoziente sbagliato è: " + quozienteSbagliato);
                    break;
                case 5:
                    if(numeroOperazioni != 0){
                        System.out.println("Hai effettuato un totale di " + numeroOperazioni + " operazioni");
                        if(numeroSomma != 0){
                            System.out.println("Addizioni: " + numeroSomma);
                        }
                        if(numeroDifferenza != 0){
                            System.out.println("Sottrazioni: " + numeroDifferenza);
                        }
                        if(numeroProdotto != 0){
                            System.out.println("Moltiplicazioni: " + numeroProdotto);
                        }
                        if(numeroQuoziente != 0){
                            System.out.println("Divisioni: " + numeroQuoziente);
                        }
                        System.out.println("Arrivederci!");
                        flag = false;
                    }else{
                        System.out.println("Non hai effettuato alcuna operazione");
                        System.out.println("Arrivederci!");
                        flag = false;
                    }
                    
                default:
                    System.out.println("Selezione sbagliata!");
                    break;
            }
        }
        scannerN.close();
    }
}
