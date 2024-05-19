public class prova {
    public static void main(String[] args) {
        int somma = 0;
        for(int i=1; i<=50; i++){
            if(i%2==0){
                System.out.println(i);
                somma = somma + i;
            }
        }
        System.out.println("La somma dei numeri pari compresi tra 1 e 50 è: " + somma);
    }
}