package ch09.lecture.p1nested.exam.exam01.exam04;

public class A {
    class B{
        int field1= 1;

        static int field2=2;

        B(){
            System.out.println("B생성자");
        }
        void method1(){
            System.out.println("b메소드");
        }
        static void method2(){
            System.out.println("b메소드2");
        }
    }

    void useB(){
        B b=new B();
        System.out.println(b.field1);
        b.method1();

        System.out.println(B.field2);
        B.method2();
    }
}
