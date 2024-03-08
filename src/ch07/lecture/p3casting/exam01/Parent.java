package ch07.lecture.p3casting.exam01;

public class Parent {
    public String field1;

    public void method1(){
        System.out.println("Parent.method1");
    }
    public void method2(){
        System.out.println("Parent.method2");
    }
}
class Child extends Parent{
    public String field2;

    public void method3(){
        System.out.println("Child.method3");
    }
}
