package Mecoledì22.Ereditarietà;
import java.util.ArrayList;
import java.util.Scanner;

public class PannaCotta {
    private String nome;
    private ArrayList<String> ingredienti;
    private double prezzo;
    
    public PannaCotta(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
        ingredienti = new ArrayList<>();
        ingredienti.add("Panna fresca");
        ingredienti.add("Zucchero");
        ingredienti.add("Gelatina");
        ingredienti.add("Vaniglia");
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(ArrayList<String> ingredienti) {
        this.ingredienti = ingredienti;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    
    //Metodo che aggiunge un ingrediente all'AL degli ingredienti del singolo oggetto Pannacotta
    public void aggiungiIngrediente(Scanner scannerStringhe){
        System.out.println("Inserisci l'ingrediente");
        String ingredienteDaAggiungere = scannerStringhe.nextLine();
        ingredienti.add(ingredienteDaAggiungere);
        System.out.println("Ingrediente aggiunto");
    }

    //Metodo che stampa l'AL degli ingredienti del singolo oggetto Pannacotta
    public void stampaIngredientiAggiunti(){
        for (String countING : ingredienti) {
            System.out.println(countING);
        }
    }
}
