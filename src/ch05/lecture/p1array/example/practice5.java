package ch05.lecture.p1array.example;

import java.util.Arrays;

public class practice5 {
    public static void main(String[] args) {
        int []array={149, 180, 192, 170};
        int height=167;
        int count=0;
        for(int i=0; i< array.length; i++){
            if(height<array[i]){
                count++;
            }

        }
        System.out.println(count);
    }
}
