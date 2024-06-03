package codiceJava.Venerdì31.Annotazioni;

public class MyClass {
    
    String name;
    String surname;
    int age;

    public MyClass(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @MyFirstAnnotation(value = "Sono un'annotazione che si aggancia ad un metodo")
    public String toString(){
        String info = "Nome: " + name + "\nCognome: " + surname + "\nEtà: " + age;
        return info;
    }
    
}
