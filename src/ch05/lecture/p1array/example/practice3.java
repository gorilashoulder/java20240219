package ch05.lecture.p1array.example;

public class practice3 {
    public static void main(String[] args) {
        int[][] array={
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };
        int arraysum=0;
        int arraytotal=0;
        for(int i=0; i< array.length; i++){
            arraytotal+=array[i].length;
            for(int k=0; k<array[i].length; k++){
                arraysum+=array[i][k];
            }
        }

        double arrayAvg=(double) arraysum/arraytotal;

        System.out.println(arraytotal);
        System.out.println(arraysum);
        System.out.println(arrayAvg);



    }
}
