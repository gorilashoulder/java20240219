package ch04.lecture.p2switch.example;

public class switchexample {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6)+1;

        switch(num){
            case 1:
                System.out.println("1번");
                break;
            case 2:
                System.out.println("2번");
                break;
            case 3:
                System.out.println("3번");
                break;
            case 4:
                System.out.println("4번");
                break;
            case 5:
                System.out.println("5번");
                break;
            default:
                System.out.println("6번");

                //마지막 break ; 생략가능
        }
    }
}
