package Lunedì27.EsercizioCAeInterfacce;

public class Artiglieria extends Soldato implements Specialista{

    String nome;
    String cognome;
    String grado;
    String specializzazione;
    String equipaggiamentoSpeciale;

    public Artiglieria(String nome, String cognome, String grado, String specializzazione,
            String equipaggiamentoSpeciale) {
        this.nome = nome;
        this.cognome = cognome;
        this.grado = grado;
        this.specializzazione = specializzazione;
        this.equipaggiamentoSpeciale = equipaggiamentoSpeciale;
    }

    public void combatti(){
        System.out.println("Sto combattendo");
    }

    public void specializzazione(){
        System.out.println("Sono il " + grado + " " + nome + " " + cognome + " e sono nella " + specializzazione);
    }

    public void usaEquipaggiamentoSpeciale(){
        System.out.println("Sto usando " + equipaggiamentoSpeciale);
    }
    
}
