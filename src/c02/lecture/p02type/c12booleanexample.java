package c02.lecture.p02type;

public class c12booleanexample {
    public static void main(String[] args) {
        boolean stop= true;
        if(stop) {
            System.out.println("중지");
        }
        else {
            System.out.println("시작합니다");
        }

        int x=10;
        boolean result1= (x == 20);
        boolean result2= (x != 20);
        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);
    }
}
