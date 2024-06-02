package codiceJava.Lunedì27.Interfacce.DipPolizia;

public class Main {

    public static void main(String[] args) {
        
        Detective d = new Detective("Sherlock", "Holmes", 1234);
        Poliziotto p = new Poliziotto("Kiki", "Camarena", 5678);
        

        d.descriviLavoro();
        d.ottieniMatricola();
        p.descriviLavoro();
        p.ottieniMatricola();
    }
}
