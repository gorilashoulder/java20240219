package ch12.lecture.p2wrapper;

public class C01WrapperClass {
    public static void main(String[] args) {
        //기본 타입 8개의 감싼 참조타입(클래스)8개

        int a=3;
        Integer b=a; //x 원래 안됨 저장되는 방식이 다름
        //현재 auto boxing

        double f=3.14;
        Double g=f;

        char h='가';
        Character i=h;

    }
}
