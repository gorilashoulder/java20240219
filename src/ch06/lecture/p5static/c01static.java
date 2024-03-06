package ch06.lecture.p5static;

public class c01static {
    public static void main(String[] args) {
        c01myclass o1=new c01myclass();
        o1.name="son";
        c01myclass o2=new c01myclass();
        o2.name="lee";
        //참조변수로 static 멤버(필드,메소드) 사용 권장하지 않음
        //o1.location="seoul";
        c01myclass.location="seoul";//권장하는방법;

        System.out.println(o1.location);
        System.out.println(o2.location);
        System.out.println(c01myclass.location);

        c01myclass.method2();
    }
}

class c01myclass{
    //인스턴스 필드(인스턴스 변수)
    String name;

    //static 필드(class 변수)
    static String location;

    //인스턴스 메소드
    void method1(){

    }

    //static메소드 (
    static void method2(){

    }
}
