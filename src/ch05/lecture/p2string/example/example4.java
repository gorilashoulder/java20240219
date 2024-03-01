package ch05.lecture.p2string.example;

public class example4 {
    public static void main(String[] args) {
        String old="자바 문자열은 불변입니다. 자바문자열은 String입니다";
        String newstr=old.replace("자바","java");

        System.out.println(old);
        System.out.println(newstr);
    }
}
