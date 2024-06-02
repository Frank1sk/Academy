package codiceJava.Lunedì27.Interfacce.DipPolizia;

public class Poliziotto implements Agente {

    String nome;
    String cognome;
    private int matricola;

    public Poliziotto(String nome, String cognome, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    public int getMatricola(){
        return matricola;
    }
    @Override
    public void descriviLavoro() {
        System.out.println("Sono " + nome + " " +  cognome + ", matricola " + matricola + " e arresto i narcos");
    }

    @Override
    public void ottieniMatricola(){
        System.out.println("La matricola di " + nome + " " + cognome + " è " + getMatricola());
    }
}
