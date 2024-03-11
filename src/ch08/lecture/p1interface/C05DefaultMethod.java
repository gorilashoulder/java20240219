package ch08.lecture.p1interface;

public class C05DefaultMethod {
    public static void main(String[] args) {
        C05MyInterface a=new C05Myclass1();
        C05MyInterface b=new C05Myclass2();
        a.method100();
        b.method100();
    }
}

interface C05MyInterface{
    //몸통(body)가 있는 public 인스턴스 메소드
    default void method100(){
        System.out.println("C05MyInterface.method100");
    }
}
class C05Myclass1 implements C05MyInterface{
    //default 메소드도 필요허면 재정의 가능

    @Override
    public void method100() {
        System.out.println("Hello");
    }
}
class C05Myclass2 implements C05MyInterface{}
