/* Grifondoro
 * colori: scarlatto e oro
 * carattere: coraggioso, audace, cavalleria
 * animale: leone
 * elmento: fuoco
 * 
 * Tassorosso
 * colori: giallo e nero
 * carattere: dedizione, paziente, leale (fair play, duro lavoro)
 * animale: tasso
 * elemento: terra
 * 
 * Corvonero
 * carattere: curioso, creativo, arguto (intelligenza, conoscenza)
 * colori: blu e bronzo
 * animale: corvo
 * elemento: aria
 * 
 * Serpeverde
 * colori: verde e nero
 * carattere: ambizione, autoconservativo, astuto (leadership, intraprendenza)
 * animale: serpente
 * elemento: acqua
 */
package Giovedì16.Switch.CappelloParlante;
import java.util.Scanner;

public class CappelloParlante {
    public static void main(String[] args) {
        Scanner scannerS = new Scanner(System.in);

        String carattere, colore, elemento, animale, sussurro;
        int casa;
        
        System.out.println("Benvenuto alla scuola di magia e stregoneria di Hogwarts");
        System.out.println("Sono il Cappello Parlante e ti assegnerò ad una delle 4 case");
        System.out.println("Qual è il tuo colore preferito?");
        colore = scannerS.nextLine();
        System.out.println("Dimmi una qualità del tuo carattere:");
        carattere = scannerS.nextLine();
        System.out.println("Qual è il tuo animale preferito?");
        animale= scannerS.nextLine();
        System.out.println("Qual è il tuo elemento preferito?");
        elemento = scannerS.nextLine();
        System.out.println("Come?! Non ho capito, hai detto qualcosa?");
        sussurro = scannerS.nextLine();

        if((!(sussurro.equalsIgnoreCase("non serpeverde!")) || (sussurro.isEmpty())) && (((carattere.equalsIgnoreCase("coraggioso")) || (carattere.equalsIgnoreCase("audace")) || (carattere.equalsIgnoreCase("cavalleria"))) && ((colore.equalsIgnoreCase("scarlatto")) || (colore.equalsIgnoreCase("oro")) ) && (elemento.equalsIgnoreCase("fuoco")) && (animale.equalsIgnoreCase("leone")))){
            casa = 1;
        }else if((!(sussurro.equalsIgnoreCase("non serpeverde!")) || (sussurro.isEmpty())) && ((carattere.equalsIgnoreCase("dedizione")) || (carattere.equalsIgnoreCase("paziente")) || (carattere.equalsIgnoreCase("leale"))) && ((colore.equalsIgnoreCase("giallo")) || (colore.equalsIgnoreCase("nero")) ) && (elemento.equalsIgnoreCase("terra")) && (animale.equalsIgnoreCase("tasso"))){
            casa = 2;
        }else if((!(sussurro.equalsIgnoreCase("non serpeverde!")) || (sussurro.isEmpty())) &&((carattere.equalsIgnoreCase("curioso")) || (carattere.equalsIgnoreCase("creativo")) || (carattere.equalsIgnoreCase("arguto"))) && ((colore.equalsIgnoreCase("blu")) || (colore.equalsIgnoreCase("bronzo")) ) && (elemento.equalsIgnoreCase("aria")) && (animale.equalsIgnoreCase("corvo"))){
            casa = 3;
        }else if(((carattere.equalsIgnoreCase("ambizione")) || (carattere.equalsIgnoreCase("autoconservativo")) || (carattere.equalsIgnoreCase("astuto"))) && ((colore.equalsIgnoreCase("verde")) || (colore.equalsIgnoreCase("nero")) ) && (elemento.equalsIgnoreCase("acqua")) && (animale.equalsIgnoreCase("serpente"))){
            casa = 4;
        }else{
            casa = 0;
        }

        switch (casa) {
            case 1:
                System.out.println("GRIFONDORO!!!");
                break;
            case 2:
                System.out.println("TASSOROSSO!!!");
                break;
            case 3:
                System.out.println("CORVONERO!!!");
                break;
            case 4:
                System.out.println("SERPEVERDE!!!");
                break;
            default:
                System.out.println("Vai a fare compagnia a Gazza...");
                break;
        }
        scannerS.close();
    }
}
