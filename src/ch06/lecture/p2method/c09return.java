package ch06.lecture.p2method;

import java.util.Random;

public class c09return {
    public static void main(String[] args) {
        c09myclass obj=new c09myclass();
        obj.method2();
    }
}

class c09myclass{
    void method1(){
        //return:
        //1. 메소드 종료

        System.out.println("statement 1");
        System.out.println("statement 2");

        return;//메소드 종료
        //메소드가 호출된 곳으로 값 반환
        //이 때, 반환되는 값의 타입이 메소드의 타입과 일치해야함!

       // System.out.println("statement 3"); //실행안됨
    }

    void method2(){
        Random random= new Random();
        while(true){
            int dice1= random.nextInt(6)+1;
            int dice2= random.nextInt(6)+1;

            System.out.println("("+dice1+","+dice2+")");
            if(dice1==dice2){
                    return;
            }
        }
    }
}