package Annotations;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@java.lang.annotation.Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyMethodAnnotation{
    String description();
}

public class TargetEx {
    @MyMethodAnnotation(description = "Example Method Annotation")
    public void annotatedMethod(){
        System.out.println("This method has a method-specific annotation");
    }
}
