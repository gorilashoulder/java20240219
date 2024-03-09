package ch07.lecture.p4abstract;

public class C01Abstract {
    public static void main(String[] args) {
        C01Animal sohee=new C01Tiger();
        C01Animal tiger=new C01Tiger();
    }
    //추상 클래스로 인스턴스 생성불가!
    //C01Animal animal1=new C01Animal();
    //
}
abstract class C01Animal{}
//
class C01Tiger extends C01Animal{}
class C01Bird{}
