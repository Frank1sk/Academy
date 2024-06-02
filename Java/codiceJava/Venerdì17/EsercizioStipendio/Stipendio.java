/* Creare un software che accetti in input 2 parametri: numero di mesi e tassazione.
 * Chiedere all'utente inolte di inserire lo stipendio percepito per ogni mese.
 * Calcolare lo stipendio medio con e senza tasse.
 * Nota: tassazione calcolata sul totale.
*/

package EsercizioStipendio;
import java.util.Scanner;

public class Stipendio {
    public static void main(String[] args) {
        Scanner scannerN = new Scanner(System.in);
        int numeroMesi, tasse, stipendioMensile[],  somma;
        float mediaT, mediaNT;
        String mesi[] = {"Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};
        somma = 0;
        System.out.println("Inserire il numero di mesi:");
        numeroMesi = scannerN.nextInt();
        System.out.println("Inserire la tassazione in %:");
        tasse = scannerN.nextInt();
        stipendioMensile = new int[numeroMesi];

        System.out.println("Inserisci lo stipendio per ogni mese:");
        for(int i = 0; i < numeroMesi; i++){
            System.out.println(mesi[i] + ": ");
            stipendioMensile[i] = scannerN.nextInt();
            somma = somma + stipendioMensile[i];
        }

        mediaNT = somma/numeroMesi;
        mediaT = (somma - ((somma/100)*tasse))/numeroMesi;
        System.out.println("Hai guadagnato " + mediaNT + "euro/mese lordi");
        System.out.println("Hai guadagnato " + mediaT + "euro/mese netti");
        scannerN.close();
    }
}
