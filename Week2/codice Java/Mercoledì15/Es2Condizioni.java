import java.util.Scanner;

public class Es2Condizioni {
    public static void main(String[] args) {

        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
        String nomeUtente;
        int punteggioIniziale = 15, risposta, minus = 0, punteggioFinale;
        boolean erratoUno = false;
        boolean erratoDue = false;
        boolean erratoTre = false;

        System.out.println("Inserisci il tuo nome utente:");
        nomeUtente = scannerS.nextLine();

        System.out.println("1) Quanto fa 11*3?");
        risposta = scannerN.nextInt();
        if(risposta != 33){
            minus = minus + 1;
            erratoUno = true;
        }

        System.out.println("2) Quanto fa 22+10?");
        risposta = scannerN.nextInt();
        if(risposta != 32){
            minus = minus + 1;
            erratoDue = true;
        }

        System.out.println("3) Quanto fa 27-4?");
        risposta = scannerN.nextInt();
        if(risposta != 23){
            minus = minus + 1;
            erratoTre = true;
        }

        punteggioFinale = punteggioIniziale - (5*minus);
        System.out.println(nomeUtente + " il quiz è terminato e hai totalizzato " + punteggioFinale + " punti");
        if (erratoUno) {
            System.out.println("Hai sbagliato la prima domanda");
        }
        if (erratoDue) {
            System.out.println("Hai sbagliato la seconda domanda");
        }
        if (erratoTre) {
            System.out.println("Hai sbagliato la terza domanda");
        }
        
        scannerS.close();
        scannerN.close();
    }
}
