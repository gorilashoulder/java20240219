package ch05.lecture.p1array;

import java.util.Arrays;

public class c12Arraysre {
    public static void main(String[] args) {
        //java.utill.Arrays:유틸리티 클래스


        //toString :배열을 보기 좋게 String으로 변환
        int[] arr1 = {9, 1, 3, 0, 4};
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("---------------");

        //sort : 배열을 오름차순으로 정렬;
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("----------------");


        //fill : 특정값으로 배열 채우기 ;
        int arr2[] = new int[5];
        System.out.println(Arrays.toString(arr2));
        Arrays.fill(arr2, 23);
        System.out.println(Arrays.toString(arr2));
        System.out.println("-----------------");

        //copyof 배열 복사
        int[] arr3 = {9, 3, 0, 4, 2};
        int[] arr4 = arr3;
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

        arr4[0]=10;
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println("-----------------");

        int[] arr5 = {5,6,7,1,2};
        int[] arr6 =Arrays.copyOf(arr5,arr5.length);
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));

        arr5[0]=50;
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));

    }
}
