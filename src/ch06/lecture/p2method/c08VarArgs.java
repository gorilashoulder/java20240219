package ch06.lecture.p2method;

public class c08VarArgs {
    public static void main(String[] args) {

    }
}

class c08myclass{

    void method1(){
        System.out.println("c08myclass.method1,파라미터없음");

    }
    void method1(int a){
        System.out.println("c08myclass.method1");
    }

    void method1(int a, int b){

    }

    //varargs(가변인자,가변길이 매개변수)
    void method2(int...a){

    }
}
