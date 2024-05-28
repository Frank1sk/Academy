package Mecoledì22.Ereditarietà;

import java.util.Scanner;

public class PannaCottaCioccolato extends PannaCotta {

    private double percentualeCioccolato;

    public PannaCottaCioccolato(String nome, double prezzo,
            double percentualeCioccolato) {
        super(nome, prezzo);
        this.percentualeCioccolato = percentualeCioccolato;
    }

    public double getPercentualeCioccolato() {
        return percentualeCioccolato;
    }

    public void setPercentualeCioccolato(double percentualeCioccolato) {
        this.percentualeCioccolato = percentualeCioccolato;
    }

    public void aggiungiIngrediente(Scanner scannerStringhe, double percentualeCioccolato){
        getIngredienti().add(percentualeCioccolato + "% di Cioccolato");
        super.aggiungiIngrediente(scannerStringhe);
    }

}
