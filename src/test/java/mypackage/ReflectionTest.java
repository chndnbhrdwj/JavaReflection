package mypackage;

import org.testng.annotations.Test;

import java.lang.reflect.Field;

/**
 * Created by chandank on 01/02/2017.
 */
public class ReflectionTest {

    @Test
    public void testReflection(){
        Class aClass = AnnotatedClass.class;
        Field[] fields= aClass.getDeclaredFields();
        for(Field field: fields){
            FindBy a=field.getAnnotation(FindBy.class);
            System.out.println(a.age()+ " ** "+a.name()+ " ** "+a.young());
        }
    }
}
