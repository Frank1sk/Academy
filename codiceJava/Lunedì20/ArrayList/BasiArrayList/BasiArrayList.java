package codiceJava.Lunedì20.ArrayList.BasiArrayList;
import java.util.ArrayList;
public class BasiArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo"); //aggiunge elemento all'AL
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.set(0, "Opel"); //aggiunge elemento all'AL nella posizione 0
        System.out.println(cars); //stampa l'AL
        System.out.println(cars.size()); //stampa la dimensione dell'AL
        System.out.println(cars.get(0)); //stampa l'elemento in posizione 0 dell'AL
        cars.remove(0); //rimuove l'elemento in posizione 0 dell'AL
        cars.clear(); //svuota l'AL
    }
}
