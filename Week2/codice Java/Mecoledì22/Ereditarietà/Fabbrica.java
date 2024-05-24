package Mecoledì22.Ereditarietà;

import java.util.ArrayList;
import java.util.Scanner;

public class Fabbrica {

    ArrayList<PannaCotta> listaPanneCotte;

    public Fabbrica() {
        listaPanneCotte = new ArrayList<PannaCotta>();
    }

    public void aggiungiPannaCotta() {
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
        System.out.println("1 - Classica\n2 - Frutta\n3 - Cioccolato");
        int variante = scannerN.nextInt();
        if (variante == 1) {
            PannaCotta v1 = new PannaCotta(null, 0);
            System.out.println("Nome");
            String nome = scannerS.nextLine();
            v1.setNome(nome);
            System.out.println("Prezzo");
            double prezzo = scannerN.nextDouble();
            v1.setPrezzo(prezzo);
            boolean altro = true;
            while(altro){
                String aggiungi;
                System.out.println("Vuoi aggiungere ingredienti extra?");
                aggiungi = scannerS.nextLine();
                while (aggiungi.isEmpty() && !(aggiungi.toLowerCase().equals("si")) && !(aggiungi.toLowerCase().equals("no"))) {
                    System.out.println("Risposta non valida! Rispondere con si o no");
                    System.out.println("Vuoi aggiungere ingredienti extra?");
                    aggiungi = scannerS.nextLine();
                }
                if(aggiungi.toLowerCase().equals("si")){
                    v1.aggiungiIngrediente();
                }else{
                    altro = false;
                }
            }
            listaPanneCotte.add(v1);
            System.out.println("Panna cotta classica aggiunta");
        } else if (variante == 2) {
            PannaCottaFrutta v2 = new PannaCottaFrutta(null, 0, null);
            System.out.println("Nome");
            String nome = scannerS.nextLine();
            v2.setNome(nome);
            System.out.println("Prezzo");
            double prezzo = scannerN.nextDouble();
            v2.setPrezzo(prezzo);
            System.out.println("Tipo di frutta");
            String frutta = scannerS.nextLine();
            v2.setTipoFrutta(frutta);
            boolean altro = true;
            while(altro){
                String aggiungi;
                System.out.println("Vuoi aggiungere ingredienti extra?");
                aggiungi = scannerS.nextLine();
                while (aggiungi.isEmpty() && !(aggiungi.toLowerCase().equals("si")) && !(aggiungi.toLowerCase().equals("no"))) {
                    System.out.println("Risposta non valida! Rispondere con si o no");
                    System.out.println("Vuoi aggiungere ingredienti extra?");
                    aggiungi = scannerS.nextLine();
                }
                if(aggiungi.toLowerCase().equals("si")){
                    v2.aggiungiIngrediente();
                }else{
                    altro = false;
                }
            }
            listaPanneCotte.add(v2);
            System.out.println("Panna cotta alla frutta aggiunta");
        } else if (variante == 3) {
            PannaCottaCioccolato v3 = new PannaCottaCioccolato(null, 0, 0);
            System.out.println("Nome");
            String nome = scannerS.nextLine();
            v3.setNome(nome);
            System.out.println("Prezzo");
            double prezzo = scannerN.nextDouble();
            v3.setPrezzo(prezzo);
            System.out.println("Tipo di frutta");
            double prcCioccolato = scannerS.nextDouble();
            v3.setPercentualeCioccolato(prcCioccolato);
            boolean altro = true;
            while(altro){
                String aggiungi;
                System.out.println("Vuoi aggiungere ingredienti extra?");
                aggiungi = scannerS.nextLine();
                while (aggiungi.isEmpty() && !(aggiungi.toLowerCase().equals("si")) && !(aggiungi.toLowerCase().equals("no"))) {
                    System.out.println("Risposta non valida! Rispondere con si o no");
                    System.out.println("Vuoi aggiungere ingredienti extra?");
                    aggiungi = scannerS.nextLine();
                }
                if(aggiungi.toLowerCase().equals("si")){
                    v3.aggiungiIngrediente();
                }else{
                    altro = false;
                }
            }
            listaPanneCotte.add(v3);
            System.out.println("Panna cotta alla frutta aggiunta");
        }
        scannerS.close();
        scannerN.close();
    }

    //Metodo che stampa l'AL di pannecotte per nome e prezzo e richiama stampaIngredientiAggiunti per stampare la lista degli ingredienti di ogni pannacotta
    public void stampaListaPanneCotte() {
        System.out.println("Lista Pannecotte disponibili:");
        for (PannaCotta countPC : listaPanneCotte) {
            System.out.println("Nome: " + countPC.getNome() + ", Prezzo: " + countPC.getPrezzo() + " euro");
            countPC.stampaIngredientiAggiunti();
        }
    }

    //Ricerca di una pannacotta scorrendo l'AL e usando un boolean quando c'è un match
    public void ricercaPannacotta(){
        Scanner scannerSrc = new Scanner(System.in);
        String nomeRicerca;
        boolean trovato = true;
        System.out.println("Inserire il nome della Pannacotta");
        nomeRicerca = scannerSrc.nextLine();
        for (PannaCotta countPC : listaPanneCotte) {
            if(countPC.getNome().toLowerCase().equals(nomeRicerca)){
                trovato = true;
                break;
            }else{
                trovato = false;
            }
        }
        if(trovato){
            System.out.println("Pannacotta disponibile");
        }else{
            System.out.println("Pannacotta non disponibile");
        }
        scannerSrc.close();
    
    }

    public void famiglia(){
        listaPanneCotte.clear();
        System.out.println("Con un colpo di stato, la famiglia del capo si è impossessata della Campari Factory e l'ha saccheggiata!!!");
    }
}
