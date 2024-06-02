/*
 * Codizioni
 * A,B,C true ->1
 * A,B true C false ->2
 * A,B, false C true -> 3
 * A,B,C false ->default
 */
package codiceJava.Giovedì16.Switch.SmistamentoClassi;
import java.util.Scanner;

public class SmistamentoClassi {
    public static void main(String[] args) {
        String nome, classe, sezione;
        int eta, anno, smistamento = 0;
        
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);

        System.out.print("Inserisci il nome: ");
        nome = scannerS.nextLine();
        System.out.print("Inserisci l'età: ");
        eta = scannerN.nextInt();
        System.out.print("Inserisci l'anno scolastico: ");
        anno = scannerN.nextInt();
        System.out.print("Inserisci la sezione: ");
        sezione = scannerS.nextLine();

        classe = anno + sezione;

        if ((nome.toLowerCase().startsWith("f")) && (eta % 2 == 0) && (classe.toLowerCase().endsWith("a"))) {
            smistamento = 1;
        }else if((nome.toLowerCase().startsWith("f")) && (eta % 2 == 0) && !(classe.toLowerCase().endsWith("a"))){
            smistamento = 2;
        }else if(!(nome.toLowerCase().startsWith("f")) && !(eta % 2 == 0) && (classe.toLowerCase().endsWith("a"))){
            smistamento = 3;
        }

        switch (smistamento) {
            case 1:
                System.out.println(nome + ", sei nella classe di Matematica");
                break;
            case 2:
                System.out.println(nome + ", sei nella classe di Fisica");
                break;
            case 3:
                System.out.println(nome + ", sei nella classe di Inglese");
                break;
            default:
                System.out.println(nome + ", questa è una scuola elitara non c'è posto per te!");
                break;
        }
        scannerN.close();
        scannerS.close();
    }
}
