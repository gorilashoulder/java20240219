package ch06.lecture.p2method;

public class c07overload {
    public static void main(String[] args) {
        c07myclass o1=new c07myclass();
        o1.method1(); //메소드 호출시 argument의 타입을 보고 실행 시킬 메소드 결정됨
        o1.method1(3);
        o1.method1(3.14);
        o1.method1(3.14,9.8);
        o1.method1(3,3.14);
    }
}

class c07myclass{
    //파라미터의 갯수, 타입이 다른
    //같은 이름의 메소드 작성 가능

    void method1(){

    }

    void method1(int a){

    }

    void  method1( double a){

    }

    void  method1(double a, double b){

    }

    void method1(double a,double b, double c){

    }

    void  method1(double a, int b){

    }
    void method1(int a, double b){

    }
}
