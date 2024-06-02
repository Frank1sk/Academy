package Mecoledì22.Ereditarietà;

import java.util.Scanner;

public class PannaCottaFrutta extends PannaCotta{
    
    private String tipoFrutta;

    public PannaCottaFrutta(String nome, double prezzo, String tipoFrutta) {
        super(nome, prezzo);
        this.tipoFrutta = tipoFrutta;
    }

    public String getTipoFrutta() {
        return tipoFrutta;
    }

    public void setTipoFrutta(String tipoFrutta) {
        this.tipoFrutta = tipoFrutta;
    }

    public void aggiungiIngrediente(Scanner scannerStringhe, String tipoFrutta){
        getIngredienti().add(tipoFrutta);
        super.aggiungiIngrediente(scannerStringhe);
    }
}
