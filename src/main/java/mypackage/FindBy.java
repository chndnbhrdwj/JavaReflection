package mypackage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by chandank on 01/02/2017.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FindBy {
    String name() default "Peter";
    int age() default 28;
    boolean young() default true;
}
