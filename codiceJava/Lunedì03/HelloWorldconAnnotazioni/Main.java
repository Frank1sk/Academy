import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();
        // Riflettiamo sulla presenza dell'annotazione
        Method method = HelloWorld.class.getMethod("sayHello");
        // Verifica se l'annotazione è presente
        if (method.isAnnotationPresent(MyAnnotation.class)) {
            // Ottieni l'annotazione
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            // Stampa il valore dell'annotazione
            System.out.println("Valore dell'annotazione: " + annotation.value());
        }
    }
}
