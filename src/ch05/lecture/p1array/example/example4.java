package ch05.lecture.p1array.example;

public class example4 {
    public static void main(String[] args) {
        int[] scores ={84,90,96};

        int sum=0;
        for(int i=0; i<scores.length; i++){
            sum+=scores[i];
        }
        System.out.println(sum);

        double avg =(double) sum / scores.length;
        System.out.println("평균=" +avg);
    }
}
