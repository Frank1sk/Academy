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
                    System.out.println("-----");
                    mCfactory.aggiungiPannaCotta(scannerS, scannerN);
                    System.out.println("-----");
                    break;
                case 2:
                    System.out.println("-----");
                    mCfactory.stampaListaPanneCotte();
                    System.out.println("-----");
                    break;
                case 3:
                    System.out.println("-----");
                    mCfactory.ricercaPannacotta(scannerS);
                    System.out.println("-----");
                    break;
                case 4:
                    System.out.println("*****");
                    System.out.println("Arrivederci!");
                    System.out.println("*****");
                    continua = false;
                    break;
                case 5:
                    System.out.println("*****");
                    mCfactory.famiglia();
                    System.out.println("*****");
                    break;
                default:
                    System.out.println("*****");
                    System.out.println("Hai inserito una scelta sbagliata!");
                    System.out.println("*****");
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
