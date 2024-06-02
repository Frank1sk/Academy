package Lunedì20.Costruttore.ProvaCostruttore;

public class ProvaCostruttore {
    int x;
    public ProvaCostruttore(){ //Costruttore di ProvaCostruttore
        x = 5;
    }

    public static void main(String[] args) {
        ProvaCostruttore myObj = new ProvaCostruttore(); //chiama costruttore per istanziare oggetto di quel tipo
        System.out.println(myObj.x);
    }
}
