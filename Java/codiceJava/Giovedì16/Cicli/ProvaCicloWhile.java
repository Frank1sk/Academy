package Giovedì16.Cicli;

public class ProvaCicloWhile {
    public static void main(String[] args) {
        /* Modo sbagliato */
        System.out.println("Modo sbagliato");
        int i = 0;
        while(i < 5){
            i++;
            System.out.println("passo while " + i);
        }

        System.out.println();
        int j = 0;
        do{
            j++;
            System.out.println("Passo do...while "+ j);
        }while(j < 5);

        System.out.println();
        System.out.println();
        System.out.println("Modo corretto");
        int k = 0;
        while(k < 0){
            k++;
            System.out.println("passo while " + k);
        }

        System.out.println();
        int z = 0;
        do{
            z++;
            System.out.println("Passo do...while "+ z);
        }while(z < 0);

        /* Il modo "sbagliato" vorrebbe dimostrare fin dove arrivano i 2 cicli, il modo "corretto" invece mostra che il while esegue almeno una volta il codice che ha in pancia SOLO SE la condizione è vera, mentre il do...while esegue almeno una volta il codice che ha in pancia ANCHE SE la condizione NON è vera.
        In parole povere, il while per com'è fatto ragiona così (sul singolo step):
        verifico
        eseguo

        Mentre il do...while per com'è fatto ragiona così (sul singolo step):
        eseguo
        verifico
        eseguo
         */
        
        /* Per notare questa differenza di "ragionamento" basta prendere il "metodo sbagliato" e modificarlo così */
        /* Modo sbagliato...ma corretto */
        System.out.println();
        System.out.println();
        System.out.println("Modo sbagliato");
        int m = 0;
        while(m < 5){
            m++;
            System.out.println("passo while " + m);
        }

        System.out.println();
        int n = 0;
        do{
            n++;
            System.out.println("Passo do...while "+ n);
        }while(n <= 5);
    }
}
