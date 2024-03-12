package ch09.lecture.p1nested.exam.exam01.exam06;

public class A {
    void useB(){
        class B{
            int field1 =1;
            static int field2=2;

            B(){
                System.out.println("B생성자");
            }
            void method1(){
                System.out.println("B메소드실행");
            }
            static void method2(){
                System.out.println("B메소드2실행");
            }

        }

        B b=new B();
        System.out.println(b.field1);
        b.method1();

        System.out.println(B.field2);
        b.method2();
    }
}
