package ch07.lecture.p5super;

import ch07.lecture.p3casting.exam01.Parent;

public class C01super {
    public static void main(String[] args) {
        C01Child child=new C01Child();
        child.method1();
    }
}

class C01Parent{
    public void method1(){
        System.out.println("부모 클래스 코드");
        System.out.println("안녕");
    }
}
class C01Child extends C01Parent{
    @Override
    public void method1() {
        //super : 상위 타입의 멤버(필드,메소드)를 접근하기 위한 키워드
        super.method1();
        System.out.println("자식 클래스 코드");

    }
}
