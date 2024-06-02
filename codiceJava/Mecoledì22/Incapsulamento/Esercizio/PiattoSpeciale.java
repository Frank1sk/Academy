package codiceJava.Mecoledì22.Incapsulamento.Esercizio;

import java.util.ArrayList;
import java.util.HashMap;

public class PiattoSpeciale {

    private static final double PREZZO_BASE = 1.00;
    private ArrayList<String> ingredientiPrivati;
    private ArrayList<String> ingredientiPubblici;
    private static final HashMap<String, Double> ingredientiPrezziPrivati = new HashMap<String, Double>();
    public static final HashMap<String, Double> ingredientiPrezziPubblici = new HashMap<String, Double>();
    
    static {
        ingredientiPrezziPrivati.put("Panino Normale", 0.50);
        ingredientiPrezziPubblici.put("Panino al Sesamo", 1.00);
        ingredientiPrezziPrivati.put("Hamburger", 4.50);
        ingredientiPrezziPubblici.put("Pulled Pork", 5.00);
        ingredientiPrezziPrivati.put("Salsiccia", 4.00);
        ingredientiPrezziPubblici.put("Bacon", 3.00);
        ingredientiPrezziPrivati.put("Melanzane", 1.50);
        ingredientiPrezziPubblici.put("Peperoni", 1.50);
        ingredientiPrezziPrivati.put("Zucchine", 1.50);
        ingredientiPrezziPubblici.put("Scamorza", 2.00);
        ingredientiPrezziPrivati.put("Mozzarella", 2.00);
        ingredientiPrezziPubblici.put("Cheddar", 2.00);
        ingredientiPrezziPrivati.put("Stracciatella", 2.00);
        ingredientiPrezziPubblici.put("Cipolle Caramellate", 1.50);
        ingredientiPrezziPrivati.put("Pomodoro", 1.00);
        ingredientiPrezziPubblici.put("Lattuga", 1.00);
        ingredientiPrezziPrivati.put("Ketchup",0.50);
        ingredientiPrezziPubblici.put("Salsa BBQ", 0.50);
        ingredientiPrezziPrivati.put("Mayonnaise", 0.50);
        ingredientiPrezziPubblici.put("Senape", 0.50);
    }

    public PiattoSpeciale() {
        this.ingredientiPrivati = new ArrayList<>();
        this.ingredientiPubblici = new ArrayList<>();
    }

    public void aggiungiIngredientePrivato(String ingrediente) {
        if (ingredientiPrezziPrivati.containsKey(ingrediente)) {
            ingredientiPrivati.add(ingrediente);
        } else {
            System.out.println("Ingrediente privato non valido.");
        }
    }

    public void aggiungiIngredientePubblico(String ingrediente) {
        if (ingredientiPrezziPubblici.containsKey(ingrediente)) {
            ingredientiPubblici.add(ingrediente);
        } else {
            System.out.println("Ingrediente pubblico non valido.");
        }
    }

    public double calcolaPrezzoTotale() {
        double totale = PREZZO_BASE;
        for (String ingrediente : ingredientiPrivati) {
            totale += ingredientiPrezziPrivati.get(ingrediente);
        }
        for (String ingrediente : ingredientiPubblici) {
            totale += ingredientiPrezziPubblici.get(ingrediente);
        }
        return totale;
    }

    public void stampaIngredientiDisponibili() {
        System.out.println("******MENU'******");
        System.out.println("Ingredienti privati disponibili:");
        for (String ingrediente : ingredientiPrezziPrivati.keySet()) {
            System.out.println(ingrediente + ": " + ingredientiPrezziPrivati.get(ingrediente) + " euro");
        }
        System.out.println();
        System.out.println("Ingredienti pubblici disponibili:");
        for (String ingrediente : ingredientiPrezziPubblici.keySet()) {
            System.out.println(ingrediente + ": " + ingredientiPrezziPubblici.get(ingrediente) + " euro");
        }
        System.out.println("*****************");
    }

    public void stampaIngredientiPubblici(){
        for(String ingrediente : ingredientiPubblici){
            System.out.println(ingrediente);
        }
    }

    public void stampaIngredientiPrivati(){
        for(String ingrediente : ingredientiPrivati){
            System.out.println(ingrediente);
        }
    }
    
}
