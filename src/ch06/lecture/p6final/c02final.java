package ch06.lecture.p6final;

public class c02final {
    public static void main(String[] args) {
        method1(3);
        method2(5);
    }

    static void method1(int i){
        i=10;

    }

    //final 파라미터
    static void method2(final int j){
        // j=10; X
    }
}
