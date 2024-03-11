package sec01.solo;

import java.util.Arrays;

public class c03Array {
    public static void main(String[] args) {

        int[] a=new int[]{4,54,10,3,2};
        int answer;
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        answer=a[a.length-1]*a[a.length-2];
        System.out.println(answer);



    }
}

