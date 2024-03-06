package ch06.lecture.p5static;

public class c05static {
}

class c05myclass{
    //스태틱 필드(class 변수)
    static int age=30;
    static double area;

    //static block
    //static 멤버 초기 설정용
    static {
        System.out.println("statement ...");
        System.out.println("statement ...");
        System.out.println("statement ...");
        System.out.println("statement ...");
        area=Math.PI*10*10;
    }
    //생성자
}


