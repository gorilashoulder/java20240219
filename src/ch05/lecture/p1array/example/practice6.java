package ch05.lecture.p1array.example;

public class practice6 {
    public static void main(String[] args) {
        int answer =0;
        int []array={1, 1, 2, 3, 4, 5};
        int n=1;
        for(int i=0; i<array.length; i++){
            if(n==array[i]){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
