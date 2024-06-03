// Classe principale

public class HelloWorld {
    // Utilizzo dell'annotazione
    @MyAnnotation(value = "Hello, world!")
    public void sayHello() {
        System.out.println("Questo metodo è annotato con @MyAnnotation");
    }

}