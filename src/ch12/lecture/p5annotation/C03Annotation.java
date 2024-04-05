package ch12.lecture.p5annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class C03Annotation {
    private String name;

   @MyAnnotation3 C03Annotation(@MyAnnotation3 String name){


    }
    @MyAnnotation3
    public void method(){

    }
}

@Target({ElementType.METHOD,ElementType.PARAMETER,ElementType.TYPE,ElementType.CONSTRUCTOR})
@interface  MyAnnotation3{

}

