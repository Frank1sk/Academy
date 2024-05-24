package Mecoledì22.Ereditarietà;

public class PannaCottaCioccolato extends PannaCotta {

    private double percentualeCioccolato;

    public PannaCottaCioccolato(String nome, double prezzo,
            double percentualeCioccolato) {
        super(nome, prezzo);
        this.percentualeCioccolato = percentualeCioccolato;
        getIngredienti().add("Cioccolato " + percentualeCioccolato + "%");
    }

    public double getPercentualeCioccolato() {
        return percentualeCioccolato;
    }

    public void setPercentualeCioccolato(double percentualeCioccolato) {
        this.percentualeCioccolato = percentualeCioccolato;
    }

}
