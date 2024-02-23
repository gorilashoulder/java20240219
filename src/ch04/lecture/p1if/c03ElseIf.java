package ch04.lecture.p1if;

public class c03ElseIf {
    public static void main(String[] args) {
        //else if : 위의 조건이 false일 경우 조건 확인후 true면 실행
        if(false){
            System.out.println("statement 1");
        }
        else if (false){
            System.out.println("statement 2");
        }
        else if(false){
            System.out.println("statement 3");
        }
        else {
            // 위의 모든 조건이 false 면 실행
            System.out.println("statement 4");
        }
        System.out.println("statement 5");
        System.out.println("statement 6");

    }
}
