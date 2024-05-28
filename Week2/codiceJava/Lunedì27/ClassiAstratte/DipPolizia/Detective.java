package Lunedì27.ClassiAstratte.DipPolizia;

public class Detective extends Agente {

    String nome;
    String cognome;
    int matricola;

    
    public Detective(String nome, String cognome, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    @Override
    public void descriviLavoro() {
        System.out.println("Sono " + nome + " " +  cognome + ", matricola " + matricola + " e indago sulle persone");
    }

}
