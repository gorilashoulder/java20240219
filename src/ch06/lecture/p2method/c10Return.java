package ch06.lecture.p2method;

import java.util.Random;

public class c10Return {
    public static void main(String[] args) {
        c10myClass o=new c10myClass();
        int a=o.method1();
        int c=10/ o.method1();
        System.out.println(o.method1());

        double b=o.method2();
        double d= o.method2()*4;
        System.out.println(d);

        System.out.println("-----");
        System.out.println(o.method7(6)); // 1 ~ 6
        System.out.println(o.method7(45)); // 1 ~ 45
        System.out.println(o.method7(100)); // 1 ~ 100
    }
}



class c10myClass {
    //return: 호출한 곳으로 값 반환
    //반환되는 값의 타입이 메소드의 타입과 일치해야함

    int method1() {
        return 5;
    }

    double method2(){
        return 3.14;
    }

    String method3(){
        return "hello";
    }

    long method4(){
        return 40;
    }

    double method5(){
        return 10;
    }

    //void: 반환하는 값이 없다
    //return을 메소드 종료 기능으로만 사용 가능
    void method6(){
        //return 30; <-값 넣으면 안됨
    }

    //1~bound
    int method7(int bound){
        Random random= new Random();
        return random.nextInt(bound)+1;
    }
}

