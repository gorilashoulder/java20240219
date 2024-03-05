package ch06.lecture.p2method;

import java.util.Arrays;

public class c05CallByValue {
    public static void main(String[] args) {
        c05MyClass obj1 =new c05MyClass();
        int[] a1=new int[3];
        a1[0]=99;

        System.out.println(a1[1]);
        obj1.method(a1);
        System.out.println(Arrays.toString(a1));
        System.out.println(a1[1]);

        obj1.method2(a1);
        System.out.println(Arrays.toString(a1));
    }
}

class c05MyClass{
    void method(int[]arr){
        System.out.println(arr.length);
        arr[1]=100;
    }

    void method2(int[]arr){
        arr=new int[]{-3,-5,-7};
        System.out.println(Arrays.toString(arr));
    }
}
