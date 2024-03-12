package ch09.lecture.p2anonymous;

public class C01AnonymousClass {
    public static void main(String[] args) {
        //C01Myclass obj= new C01Myclass();
        //C01Myclass obj=new C01Child();

        //익명 클래스 객체
        C01Myclass obj=new C01Myclass() {};
    }
}
abstract class C01Myclass{}
//class C01Child extends C01Myclass{}
