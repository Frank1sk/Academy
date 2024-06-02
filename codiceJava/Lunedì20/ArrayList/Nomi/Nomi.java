/* Chiedere all'utente di inserire 5 nomi e aggiungerli all'AL.
 * Stampare tutti i nomi nell'AL
 * Chiedere all'utente un nome da cercare nell'AL e stampare se è presente o meno.
 * Chiedere all'utente un nome da rimuovere dall'AL se è presente.
 * Stampa AL aggiornato.
 */
package codiceJava.Lunedì20.ArrayList.Nomi;
import java.util.Scanner;
import java.util.ArrayList;

public class Nomi {
    public static void main(String[] args) {
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
        ArrayList<String> nomi = new ArrayList<String>();
        String nomeInput, nomeDaCercare, nomeDaRimuovere;
        int numeroNomi, trovato = 0, rimosso = 0;

        System.out.println("Quanti nomi vuoi inserire?");
        numeroNomi = scannerN.nextInt();
        System.out.println("Inserisci i nomi");
        for(int i = 0; i < numeroNomi; i++){
            System.out.println("Nome " + (i+1) + ": ");
            nomeInput = scannerS.nextLine();
            nomi.add(nomeInput);
        }

        System.out.println("Stampa");
        for(int i = 0; i < nomi.size(); i++){
            System.out.println(nomi.get(i));
        }
        
        System.out.println("Inserisci un nome da cercare: ");
        nomeDaCercare = scannerS.nextLine();
        for(int i = 0; i < nomi.size(); i++){
            if(nomeDaCercare.equals(nomi.get(i))){
                trovato = i+1;
            }
        }
        if(trovato != 0){
            System.out.println("Il nome inserito è presente si trova nella posizione: " + trovato);
        }else{
            System.out.println("Il nome inserito non è presente");
        }

        System.out.println("Inserisci un nome da rimuovere: ");
        nomeDaRimuovere = scannerS.nextLine();
        for(int i = 0; i < nomi.size(); i++){
            if(nomeDaRimuovere.equals(nomi.get(i))){
                rimosso = i;
            }
        }
        if(rimosso != 0){
            nomi.remove(rimosso);
            System.out.println("Il nome inserito è stato rimosso");
            System.out.println("Stampa aggiornata");
            for(int i = 0; i < nomi.size(); i++){
            System.out.println(nomi.get(i));
            }
        }else{
            System.out.println("Il nome che si vuole rimuovere non è presente");
        }

        scannerS.close();
        scannerN.close();
    }
}
