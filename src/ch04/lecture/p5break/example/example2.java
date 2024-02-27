package ch04.lecture.p5break.example;

public class example2 {
    public static void main(String[] args) {
        while (true) {
            int num1 = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random() * 6) + 1;
            System.out.println(STR."(\{num1}, \{num2})");
            if(num1+num2==5){
                break;
            }
        }
        System.out.println("합이 5입니다");
    }
}