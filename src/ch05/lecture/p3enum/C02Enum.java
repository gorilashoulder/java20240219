package ch05.lecture.p3enum;

import java.util.Scanner;

public class C02Enum {
    public static void main(String[] args) {
        //안전하고 읽기 쉬운 코드 작성을 위함

        Season s=Season.FALL;

        switch (s){
            case SPRING -> System.out.println("봄이네요");
            case SUMMER -> System.out.println("덥다");
            case FALL -> System.out.println("시원하다");
            case WINTER -> System.out.println("추워");
        }

        //java.lang.enum에서 상속
        System.out.println(s.name());
        System.out.println(s.ordinal());

        //java.lang.Object에서 상속
        System.out.println(s.toString());
        System.out.println(s.hashCode());
    }
}
enum Season{
    SPRING,
    SUMMER,
    FALL,
    WINTER;



}
