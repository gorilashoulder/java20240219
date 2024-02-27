package ch05.lecture.p1array.example;

public class example {
    public static void main(String[] args) {

        String[] season = {"Spring", "summer", "fall", "winter"};
        System.out.println("nuber 0:" + season[0]);
        System.out.println("nuber 1:" + season[1]);
        System.out.println("nuber 2:" + season[2]);
        System.out.println("nuber 3:" + season[3]);

        season[1]="여름";
        System.out.println("numer1:"+season[1]);
        System.out.println();

        int[] scores ={83,90,97};

        int sum=0;
        for(int i=0; i<scores.length; i++){
            sum+=scores[i];
        }
        System.out.println("총합="+sum);
        double avg= (double) sum/3;
        System.out.println("평균:" +avg);
    }

}
