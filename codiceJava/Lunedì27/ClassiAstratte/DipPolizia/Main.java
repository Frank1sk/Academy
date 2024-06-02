package codiceJava.Lunedì27.ClassiAstratte.DipPolizia;

public class Main {

    public static void main(String[] args) {
        
        Detective d = new Detective("Sherlock", "Holmes", 1234);
        Poliziotto p = new Poliziotto("Kiki", "Camarena", 5678);
        

        d.descriviLavoro();
        p.descriviLavoro();
    }
}
