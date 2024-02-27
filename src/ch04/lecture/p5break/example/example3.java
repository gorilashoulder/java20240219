package ch04.lecture.p5break.example;

public class example3 {
    public static void main(String[] args) throws Exception{
        for(int i=1; i<=10; i++){
            if(i%2 != 0){
                continue;
            }
            System.out.println(i+"");
        }
    }
}
