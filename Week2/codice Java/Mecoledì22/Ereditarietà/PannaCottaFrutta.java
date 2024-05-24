package Mecoledì22.Ereditarietà;

public class PannaCottaFrutta extends PannaCotta{
    
    private String tipoFrutta;

    public PannaCottaFrutta(String nome, double prezzo, String tipoFrutta) {
        super(nome, prezzo);
        this.tipoFrutta = tipoFrutta;
        getIngredienti().add(tipoFrutta);
    }

    public String getTipoFrutta() {
        return tipoFrutta;
    }

    public void setTipoFrutta(String tipoFrutta) {
        this.tipoFrutta = tipoFrutta;
    }
}
