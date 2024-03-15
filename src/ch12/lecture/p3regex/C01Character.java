package ch12.lecture.p3regex;

public class C01Character {
    public static void main(String[] args) {
        //정규표현식 : 특정 규칙의 문자열 표현하기 위한 문자열 패턴
        //한 문자
        String pattern1="a";
        boolean b1="a".matches(pattern1); //true
        System.out.println(b1);

        System.out.println("b".matches(pattern1));
        System.out.println("aa".matches(pattern1));
        System.out.println("aa".matches("aa"));
        System.out.println("abc".matches("abc"));



        System.out.println("\\".matches("\\\\"));

        System.out.println("---------------------------");
        //regex .:모든문자
        System.out.println(".".matches("."));
        System.out.println("D".matches("."));
        System.out.println("안".matches("."));
        System.out.println("안녕".matches("."));
        System.out.println("---------------------------");

        System.out.println(".".matches("\\."));

        //대소문자구분
        System.out.println("a".matches("A"));

    }
}
