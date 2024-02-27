package ch04.lecture.p5break.example;

public class example1 {
    public static void main(String[] args) throws Exception {
        while(true){
            int num= (int)(Math.random()*6)+1;
            System.out.println(num);
            if(num==6){
                break;
            }
        }
        System.out.println("프로그래밍 종료");
    }
}
