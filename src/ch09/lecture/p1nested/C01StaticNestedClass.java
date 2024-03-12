package ch09.lecture.p1nested;

public class C01StaticNestedClass {
    C01MyCalss.C01NestedClass obj1=new C01MyCalss.C01NestedClass();
}

class C01MyCalss{
    //정적 중첩클래스
    static class C01NestedClass{

    }
    //필드, 생성자,메소드/
    void method1(){
        C01NestedClass obj=new C01NestedClass();
    }
}
