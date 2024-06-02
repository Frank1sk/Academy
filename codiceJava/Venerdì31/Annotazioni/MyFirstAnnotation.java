package codiceJava.Venerdì31.Annotazioni;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyFirstAnnotation {
    String value() default "Ciao";
    int number() default 23;
}
