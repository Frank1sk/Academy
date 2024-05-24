package Mecoledì22.Ereditarietà;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scannerN = new Scanner(System.in);

        Fabbrica mCfactory = new Fabbrica();
        boolean continua = true;
        int scelta;

        // PannaCotta p0 = new PannaCotta("classic", 4);
        // PannaCottaFrutta p1= new PannaCottaFrutta("Fruit", 5, "fragola");
        // PannaCottaCioccolato p2 = new PannaCottaCioccolato("chocolate", 6, 30);
        // mCfactory.listaPanneCotte.add(p0);
        // mCfactory.listaPanneCotte.add(p1);
        // mCfactory.listaPanneCotte.add(p2);
        System.out.println("*****\nBenvenuto nella Campari Factory!");
        while (continua) {
            System.out.println("Cosa vuoi fare?");
            System.out.println("1 - Aggiungi panna cotta");
            System.out.println("2 - Lista Panne cotte disponibili");
            System.out.println("3 - Cerca panna cotta");
            System.out.println("4 - Esci");
            System.out.println("5 -\n*****");
            scelta = scannerN.nextInt();
            switch (scelta) {
                case 1:
                    mCfactory.aggiungiPannaCotta();
                    break;
                case 2:
                    mCfactory.stampaListaPanneCotte();
                    break;
                case 3:
                    mCfactory.ricercaPannacotta();
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
    }
}
