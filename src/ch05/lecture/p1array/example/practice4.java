package ch05.lecture.p1array.example;

import java.util.Arrays;
import java.util.jar.Attributes;

public class practice4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers2=new int[numbers.length];
        for (int i=0; i<numbers.length; i++){
            numbers2[i]=numbers[i]*2;
        }
        System.out.println(Arrays.toString(numbers2));


    }
}
