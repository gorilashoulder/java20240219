package ch06.lecture.p5static;

public class c04static {
}

class c04myclass{

    //인스턴스 필드
    String name;

    //static(정적)필드
    static String location;


    //인스턴스 필드
    void method1(){
        System.out.println(location);
    }


    //static(정적)메소드
    static void method2(){
        //static멤버에서 인스턴스 멤버에 접근하지 못홤
        System.out.println(location);
        //System.out.println(name);

        //인스턴스 멤버에서 static 멤버에 접근 가능
    }
}