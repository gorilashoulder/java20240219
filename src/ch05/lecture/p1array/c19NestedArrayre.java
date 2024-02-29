package ch05.lecture.p1array;

import java.util.Arrays;

public class c19NestedArrayre {
    public static void main(String[] args) {
        int[][]arr1= new int[2][];
        System.out.println(arr1.length); //2
        System.out.println(Arrays.toString(arr1)); //null

        arr1[0] = new int[3];
        System.out.println(Arrays.toString(arr1)); // [@9283, null]
        System.out.println(Arrays.toString(arr1[0])); // [0, 0, 0]

        arr1[1] = new int[2];
        System.out.println(Arrays.toString(arr1[1])); // [0, 0]

    }
}
