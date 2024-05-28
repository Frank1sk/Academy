package Lunedì20.Metodi.ProvaMetodi;

public class ProvaMetodi {
    int x = 5;

    static void myMethod(){
        System.out.println("Sono un metodo statico");
    } //definizione metodo statico

    void myOtherMethod(){
        System.out.println("Sono un metodo non statico");
    } //definizione metodo non statico
    public static void main(String[] args) {
        ProvaMetodi myObj = new ProvaMetodi();
        System.out.println(myObj.x);
        myMethod(); //chiamata metodo statico
        myObj.myOtherMethod(); //chiamata metodo non statico
    }
}
