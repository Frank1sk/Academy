package codiceJava.Lunedì27.Interfacce.DipPolizia;

public class Detective implements Agente{

    String nome;
    String cognome;
    private int matricola;

    public Detective(String nome, String cognome, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    public int getMatricola(){
        return matricola;
    }
    @Override
    public void descriviLavoro() {
        System.out.println("Sono " + nome + " " +  cognome + ", matricola " + matricola + " e indago sulle persone");
    }

    @Override
    public void ottieniMatricola(){
        System.out.println("La matricola di " + nome + " " + cognome + " è " + getMatricola());
    }
}
