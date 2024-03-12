package ch09.lecture.p1nested.exam.exam01.exam05;

public class A {
    A(){
        class B{}

        B b=new B();
    }

    void method(){
        class B{}
        B b=new B();
    }
}
