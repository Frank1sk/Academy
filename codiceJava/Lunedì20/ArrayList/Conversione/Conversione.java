package codiceJava.Lunedì20.ArrayList.Conversione;
import java.util.ArrayList;
import java.util.Arrays;
public class Conversione {
    public static void main(String[] args) {
        
        Integer arr[] = {1, 2, 3, 4, 5, 6}; //crea un array di Integer
        System.out.println("Array: " + Arrays.toString(arr)); //stampa l'array come una stringa
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr)); //crea AL di Integer e lo riempie con gli elementi dell'array convertito in un'AL tramite asList()
        arrayList.add(7); //aggiunge 7 all'AL
        arr = arrayList.toArray(arr); //Converte l'AL in un array riassegnandolo all'array creato all'inizio
        System.out.println("Array dopo aver aggiunto l'elemento: " + Arrays.toString(arr)); //stampa il "nuovo" array
    }
}
