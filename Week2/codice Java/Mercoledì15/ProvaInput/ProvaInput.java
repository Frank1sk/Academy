package ProvaInput;
/* Lo Scanner è una classe che gestisce la possibilità di permette all'utente di inserire un input */
import java.util.Scanner;

public class ProvaInput {
    public static void main(String[] args) {
        
        Scanner inputUtente = new Scanner(System.in);
        System.out.println("Enter username:");

        String userName = inputUtente.nextLine();
        System.out.println("Username is " + userName);

        inputUtente.close();

    }
}
