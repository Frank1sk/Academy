/* L'esercizio richiesto consiste nel creare un semplice programma in Java che gestisca un sistema di login con registrazione. Dopo il login, l'utente avrà accesso a una funzione matematica specifica.

Requisiti:

Registrazione:
- L'utente può registrarsi inserendo username e password.
- Memorizzare le credenziali degli utenti. (Nota: per semplicità, useremo un'implementazione di base senza
database, quindi le informazioni saranno perse al riavvio del programma).

Login:
- L'utente può effettuare il login inserendo username e password corretti.
- Verificare le credenziali inserite confrontandole con quelle memorizzate.

Funzione Matematica:
- Dopo il login, l'utente può accedere a una funzione che calcola il quadrato di un numero inserito dall'utente.

Logout:
- Dopo aver eseguito la funzione matematica, l'utente può scegliere di uscire o di eseguire un'altra operazione.

Flusso del Programma:
- Chiedere all'utente se desidera registrarsi o effettuare il login.
- Se l'utente sceglie di registrarsi, richiedere username e password e memorizzarle.
- Se l'utente sceglie di effettuare il login, richiedere username e password per la verifica.
- Se le credenziali sono corrette, permettere l'accesso alla funzione matematica.
- Dopo l'operazione matematica, l'utente può scegliere di effettuare il logout o ripetere l'operazione.
 */
package EsercizioLogin;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        
        boolean flag = true;
        int selezione;
        String usernameRec = "", passwordRec = "", usernameLog = "", passwordLog = "";
        String username = "Pippo", password = "123";
        int erroreLog = 1;
        Scanner scannerN = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        
        System.out.println("Benvenuto!");
        while(flag){
            System.out.println("Digita:\n1 per la registrazione\n2 per il login\n3 per uscire\n*****");
            selezione = scannerN.nextInt();
            switch (selezione) {
                case 1:
                    System.out.println("REGISTRAZIONE");
                    System.out.println("Inserisci username:");
                    usernameRec = scannerS.nextLine();
                    System.out.println("Inserisci password:");
                    passwordRec = scannerS.nextLine();
                    System.out.println("Registrazione effettuata con successo!\n*****");
                    break;
                case 2:
                    System.out.println("LOGIN");
                    if(erroreLog != 4){
                        System.out.println("Inserisci username:");
                        usernameLog = scannerS.nextLine();
                        System.out.println("Inserisci password:");
                        passwordLog = scannerS.nextLine();
                        if((usernameLog.equals(usernameRec) && passwordLog.equals(passwordRec)) || (usernameLog.equals(username) && passwordLog.equals(password))){
                            System.out.println("Login effettuato con successo!\n*****");
                            System.out.println("Inserisci un numero per calcolare il suo quadrato:");
                            int numero = scannerN.nextInt();
                            System.out.println("Il quadrato di " + numero + " è " + Math.pow(numero, 2) +"\n*****");
                        }else{
                            erroreLog++;
                            System.out.println("Credenziali errate!\nTentativi rimasti: " + (4-erroreLog) + "\n****");
                        }
                    }else{
                        System.out.println("Tentativi di login esauriti, contattare l'assistenza!\n*****");
                    }
                    break;
                case 3:
                    System.out.println("Arrivederci!\n*****");
                    flag = false;
                    break;
                default:
                    System.out.println("Selezione sbagliata!\n*****");
                    break;
            }
        }
        scannerN.close();
        scannerS.close();
    }
}

