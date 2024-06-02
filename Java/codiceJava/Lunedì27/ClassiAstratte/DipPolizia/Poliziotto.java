package Lunedì27.ClassiAstratte.DipPolizia;

public class Poliziotto extends Agente{

    String nome;
    String cognome;
    int matricola;

    
    public Poliziotto(String nome, String cognome, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    @Override
    public void descriviLavoro(){
        System.out.println("Sono " + nome + " " + cognome + ", matricola " + matricola + " e arresto i narcos");
    }
}
