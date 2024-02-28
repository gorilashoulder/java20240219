package ch05.lecture.p1array.example;

public class practice2 {
    public static void main(String[] args) {
        int answer=0;
        String[] array=new String[4];

        array[0]="심성환";
        array[1]="다봄";
        array[2]="승준";
        array[3]="대머리재환";

        for(int i=0; i< array.length; i++){
           answer=array[i].length();
            System.out.print(answer);
        }
    }
}
