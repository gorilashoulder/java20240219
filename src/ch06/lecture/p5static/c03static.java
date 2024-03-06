package ch06.lecture.p5static;

import java.util.Arrays;

//static import: 클래스명 생략하고 클래스 멤버 사용 가능하게 함
//import static java.util.Arrays.fill;
//import static java.util.Arrays.copyOf;
import static java.util.Arrays.*;


public class c03static {
    public static void main(String[] args) {
        int[]arr={2,3,4};
        int[]brr=new int[5];
        Arrays.fill(brr,100);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
    }
}
