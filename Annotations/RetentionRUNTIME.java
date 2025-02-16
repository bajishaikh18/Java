package Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value();
}

public class RetentionRUNTIME {

    @MyAnnotation(value = "Baji")
    public void myMethod() {
        System.out.println("Method with runtime annotation");
    }

}

