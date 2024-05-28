package Mecoledì22.Incapsulamento.Esercizio;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
        boolean running = true, running2 = true;

        System.out.println("Benvenuto alla Sugna Vegana!");
        while (running) {
            PiattoSpeciale panino = new PiattoSpeciale();
            panino.stampaIngredientiDisponibili();
            while (running2) {
                System.out.println("Scegli la tipologia degli ingredienti:\n1 - Privati\n2 - Pubblici\n3 - Vai al conto");
                int sceltaTipoIngredienti = scannerN.nextInt();
                switch (sceltaTipoIngredienti) {
                case 1:
                    String ingredientePrivato;
                    System.out.print("Scegli l'ingrediente privato:");
                    ingredientePrivato = scannerS.nextLine();
                    panino.aggiungiIngredientePrivato(ingredientePrivato);
                    break;
                case 2:
                    String ingredientePubblico;
                    System.out.print("Scegli l'ingrediente pubblico:");
                    ingredientePubblico = scannerS.nextLine();
                    panino.aggiungiIngredientePubblico(ingredientePubblico);
                    break;
                case 3:
                    running2 = false;
                    break;
                default:
                    System.out.println("Input non valido");
                    break;
                }
            }
            System.out.println("Ingredienti pubblici aggiunti");
            panino.stampaIngredientiPubblici();
            System.out.println("Ingredienti privati aggiunti");
            panino.stampaIngredientiPrivati();
            double totale = panino.calcolaPrezzoTotale();
            System.out.println("Il prezzo totale del panino è: " + totale + " euro");
            System.out.println("Vuoi ordinare un altro panino?");
            String risposta;
            risposta = scannerS.nextLine();
            if(risposta.equalsIgnoreCase("no")){
                running = false;
            }else{
                running2 = true;
            }
        }

        scannerS.close();
        scannerN.close();
    }
}
