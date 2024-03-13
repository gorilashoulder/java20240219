package ch16.lecture.p1lamda;

public class C03FuntionalInterface {
}

//@FunctionalInterface
interface C03MyInterface1{

}

@FunctionalInterface //ok
interface C03MyInterface2{
    void method1();
}


//@FunctionalInterface
interface C03MyInterface3{
    void method2();
    void method3();
}

@FunctionalInterface//ok
interface C03MyInterface4{
    void method4();
    default void method5(){

    }
}
@FunctionalInterface //ok
interface C03MyInterface5{
    void method6();

    //object 클래스의 public 메소드는 포함하지 않음
    String toString();

    int hashCode();

    boolean equals(Object o);
}
