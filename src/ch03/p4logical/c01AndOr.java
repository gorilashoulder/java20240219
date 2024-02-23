package ch03.p4logical;

public class c01AndOr {
    public static void main(String[] args) {
        //&& :and  논리곱
        // || : or 논리합

        //피연산자 갯수: 2개
        //피연산자의 타입 : boolean
        //연산결과의 타입 : boolean

        // &&
        //피연산자가 모두 True 일 때 결과가 true, 나머지 false
        //true&&true : true
        //나머지; false

        // ||
        //피연산자가 모두 false 일 때 결과가 false, 나머지 true
        //false||false :false
        //나머지 true

        int x=6;
        int y=3;

        boolean r1 =x<10 && y>1; //true
        boolean r2 =x==5 || y==5; //false
        System.out.println(r1);
        System.out.println(r2);
    }
}
