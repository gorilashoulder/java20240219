package ch03.p1arithemetic;

public class c01Arithmetic {
    public static void main(String[] args) {
        //산술 연산자
        //+,-,*,/,%
        //피연산자 개수: 2개
        //피연산자: numeric(정수,실수,문자)
        //연산결과의 타입: 피연산자 중 큰타입

        int a=3;
        int b=9;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(b/a);
        System.out.println(b%a); // b를a로 나눈 나머지

        System.out.println();
        ///////
        byte v1= 10;
        byte v2=4;
        int v3=5;
        long v4=10L;

        int result1 =v1+ v2;
        System.out.println(result1);

        long result2 =v1+v2-v4;
        System.out.println( result2);

        double result3= (double) v1/v2;
        System.out.println(result3);

        int result4= v1% v2;
        System.out.println(result4);
    }

}
