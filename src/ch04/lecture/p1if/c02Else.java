package ch04.lecture.p1if;

public class c02Else {
    public static void main(String[] args) {
        //else :if의 조건 ()이 false 일때 실행되는 코드 블럭의 정의

        boolean condition=false;

        if(condition){
            System.out.println("statement 1");
            System.out.println("statement 2");
        }
        else{
            // if의 조건의 false 일 때 실행
            System.out.println("statement 3");
            System.out.println("statement 4");
        }
        System.out.println("statement 5");
        System.out.println("statement 6");

        System.out.println("---------------");


        int score=95;

        if(score>90){
            System.out.println("90over");
            System.out.println("A");
        }
        else{
            System.out.println("90under");
            System.out.println("B");
        }
    }
}
