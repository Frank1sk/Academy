import java.lang.reflect.Method;
public class Main {

    public static void main(String[] args) {
        
        MyClass mc = new MyClass("Pinco", "Pallino", 66);
        System.out.println(mc.toString());

        try{
            Method method = MyClass.class.getMethod("toString");
            if(method.isAnnotationPresent(MyFirstAnnotation.class)){
                MyFirstAnnotation annotation = method.getAnnotation(MyFirstAnnotation.class);
                System.out.println(annotation.value());
            }
        }catch(NoSuchMethodException e){
            e.printStackTrace();
        }
    }
}
