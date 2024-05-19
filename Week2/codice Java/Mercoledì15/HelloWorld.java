public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println("I will print on another line");
        System.out.print("Hello, world! ");
        System.out.print("I will print on the same line");

        String testo = "prova";
        System.out.println(testo);

        /* L'operatore + concatena le stringhe */
        testo = "Mondo!";
        System.out.println("Ciao, " + testo);

        String firstPart = "Ciao, ";
        String lastPart = "Mondo!";
        String fullPart = firstPart + lastPart;
        System.out.println(fullPart);

        /* L'operatore + somma i numeri */
        int x = 5;
        int y = 6;
        System.out.println(x + y);

        /* Variabili dello stesso tipo posso essere dichiarate (e assegnate) sulla stessa riga di codice */
        int z = 7, k = 8, j = 9;
        System.out.println(z + k + j);

        int m, n, o;
        m = n = o = 50;
        System.out.println(m + n + o);

        /* Primo approccio con le espressioni che tipicamente si trovano all'interno delle strutture condizionali
         * Nota: anche se lavora con i numeri, stampa una stringa
         */
        int a = 10, b = 9;
        System.out.println(a > b);
    }
}

