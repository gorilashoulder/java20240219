package ch12.lecture.p5annotation.exam.exam01;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD})
@Retention(RUNTIME)
public @interface PrintAnnotation {
    String value()default "-";
    int number()default 15;
}
