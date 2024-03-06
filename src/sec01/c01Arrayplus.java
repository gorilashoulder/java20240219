package sec01;

import java.util.Arrays;

public class c01Arrayplus {
    public static void main(String[] args) {


        int n=1234;
        int answer = 0;
        String str=Integer.toString(n);
        String [] arr= str.split("");
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length; i++){
            answer+=Integer.parseInt(arr[i]);
        }
        System.out.println(answer);

    }
}
