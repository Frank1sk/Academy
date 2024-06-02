package codiceJava.Lunedì27.EsercizioCAeInterfacce;

public class Main {

    public static void main(String[] args) {
        
        Fanteria f = new Fanteria("Simon", "Riley", "Sergente", "Task Force 141", "ACR");
        Artiglieria a = new Artiglieria("John", "Price", "Capitano", "Task Force 141", "M1911");

        f.specializzazione();
        f.usaEquipaggiamentoSpeciale();
        f.combatti();

        a.specializzazione();
        a.usaEquipaggiamentoSpeciale();
        a.combatti();
    }
}
