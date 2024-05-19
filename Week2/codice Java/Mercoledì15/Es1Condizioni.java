import java.util.Scanner;
public class Es1Condizioni {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci la tua eta:");
        int eta = input.nextInt();

        if(eta < 18){
            System.out.println("Hai " + eta + " anni, sei minorenne");
        }else if(eta >= 18 && eta < 25){
            System.out.println("Hai " + eta + " anni, sei giovane");
        }else if(eta >= 25 && eta <= 60){
            System.out.println("Hai " + eta + " anni, sei adulto");
        }else{
            System.out.println("Hai " + eta + " anni, sei anziano");
        }

        input.close();
    }
}
