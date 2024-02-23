package ch04.lecture.p1if;

public class c01if {
    public static void main(String[] args) {
        //if :조건문 , 분기문 (branch)
        //() 괄호 안에 값이 true = {} 을 실행
        //               false= X


        System.out.println("명령문 1");
        if(false){
            System.out.println("명령문 2");
        }
        if(5>3){
            System.out.println("명령문 3");
            System.out.println("명령문 4");
        }
        if(true&&false){
            System.out.println("명령문 5");
            System.out.println("명령문 6");
        }
    }
}
