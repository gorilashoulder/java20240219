package ch09.lecture.p1nested.exam.exam01.exam02;

public class AExample {
    public static void main(String[] args) {
        A.B b=new A.B();
        System.out.println(b.field1);
        b.method1();

        System.out.println(A.B.field2);
        A.B.method2();
    }
}
