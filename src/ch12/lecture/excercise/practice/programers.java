package ch12.lecture.excercise.practice;

import java.util.Arrays;

import static java.lang.String.*;

public class programers {
    public static void main(String[] args) {
        String myString="axbxcxdx";
        String [] a=myString.split("x");
        System.out.println(Arrays.toString(a));

    }

}
