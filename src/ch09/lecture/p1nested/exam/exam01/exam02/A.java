package ch09.lecture.p1nested.exam.exam01.exam02;

public class A {
    static class B{
        int field1 =1;;

        static int field2=2;

        B(){
            System.out.println("B생성자");
        }
        void method1(){
            System.out.println("B메소드 실행");
        }
        static void method2(){
            System.out.println("B메소드2 실행");
        }
    }
}
