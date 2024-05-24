package Lunedì20.SocialNetwork;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        boolean running = true;
        Scanner scannerN = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        ArrayList<Utente> utenti = new ArrayList<Utente>();
        
        //Placeholder per login
        Utente u0 = new Utente(null, null, null, null);
        Utente u1 = new Utente("pippo@provider", "123", "ppp10", "Pippo");
        utenti.add(u1);
        int scelta, tentativiRimasti = 0;

        System.out.println("Benvenuto!");
        while (running) {
            menu();
            scelta = scannerN.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("Registrazione");
                    u0.registrazione(scannerS, utenti);
                    break;
                case 2:
                    System.out.println("Login");
                    if(tentativiRimasti != 4){
                        /* Metodo login */
                        tentativiRimasti = u0.login(scannerS, scannerN, utenti, tentativiRimasti);
                    }else{ /* Quando erroreLog == 4 */
                        System.out.println("Tentativi di Login esauriti, contattare l'assistenza!");
                    }
                    break;
                case 3:
                    System.out.println("Uscita");
                    running = false;
                    break;
                default:
                    System.out.println("Input sbagliato");
                    break;
            }
        }
        scannerN.close();
        scannerS.close();
    }

    static void menu(){
        System.out.println("Digita:\n1 - Registrazione\n2 - Login\n3 - Uscita");
    }
}
