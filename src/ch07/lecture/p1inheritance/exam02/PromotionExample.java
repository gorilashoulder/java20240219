package ch07.lecture.p1inheritance.exam02;

public class PromotionExample {
    public static void main(String[] args) {
        B b =new B();
        C c= new C();
        D d= new D();
        E e= new E();

        A a1= b;
        A a2= b;
        A a3= d;
        A a4 =e;

        B b1= d;
        C c1 =e;

      //  B b3= e;
     //   C c2 =d;
    }
}
