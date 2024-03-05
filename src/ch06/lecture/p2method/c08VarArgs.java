package ch06.lecture.p2method;

public class c08VarArgs {
    public static void main(String[] args) {
        c08myclass o1 = new c08myclass();
        o1.method1();
        o1.method1(1);
        o1.method1(3, 3);
//        o1.method1(6, 7, 8); // x
        o1.method2();
        o1.method2(5);
        o1.method2(7, 8);
        o1.method2(100, 1, 2, 34, 5, 1, 5, 1);

    }
}

class c08myclass{

    void method1(){
        System.out.println("c08myclass.method1,파라미터없음");

    }
    void method1(int a){
        System.out.println("c08myclass.method1,파라미터 1개");
    }

    void method1(int a, int b){
        System.out.println("c08myclass.method1,파라미터 2개");
    }

    //varargs(가변인자,가변길이 매개변수)
    void method2(int...a){
        System.out.println("c08myclass.method2,파라미터 0개 이상");
    }
}
