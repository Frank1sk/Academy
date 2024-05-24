package Mecoledì22.Ereditarietà;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scannerN = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        Fabbrica mCfactory = new Fabbrica();
        boolean continua = true;
        int scelta;

        System.out.println("*****\nBenvenuto nella Campari Factory!");
        while (continua) {
            menu();
            scelta = scannerN.nextInt();
            switch (scelta) {
                case 1:
                    mCfactory.aggiungiPannaCotta(scannerS, scannerN);
                    break;
                case 2:
                    mCfactory.stampaListaPanneCotte();
                    break;
                case 3:
                    mCfactory.ricercaPannacotta(scannerS);
                    break;
                case 4:
                    System.out.println("Arrivederci!");
                    continua = false;
                    break;
                case 5:
                    mCfactory.famiglia();
                    continua = false;
                    break;
                default:
                    System.out.println("Hai inserito una scelta sbagliata!");
                    break;
            }
        }

        scannerN.close();
        scannerS.close();
    }

    static void menu(){
        System.out.println("Cosa vuoi fare?");
        System.out.println("1 - Aggiungi panna cotta");
        System.out.println("2 - Lista Panne cotte disponibili");
        System.out.println("3 - Cerca panna cotta");
        System.out.println("4 - Esci");
        System.out.println("5 -\n*****");
    }
}
