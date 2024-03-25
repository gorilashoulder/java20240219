package ch11.lecture.p3custom;

public class C01Custom {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        throw new RuntimeException("문고리 고장");
    }
}
