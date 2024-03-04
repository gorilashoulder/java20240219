package ch05.lecture.p2string;

import java.util.Arrays;

public class c10split {
    public static void main(String[] args) {
        //split:
        // 문자열을 주어진 정규 표현식(regular expression)과 일치하는 부분을 기준으로 분리;

        String s1="hello world";
        String [] worlds=s1.split(" ");
        System.out.println(worlds);
        System.out.println(worlds.length);
        System.out.println(worlds[0]);
        System.out.println(worlds[1]);

        String s2="css,react,html,spring";
        String []word2=s2.split(",");
        System.out.println(word2.length);
        System.out.println(word2[0]);
        System.out.println(word2[1]);
        System.out.println(word2[2]);

        String s3="spring";
        String []word3=s3.split("");
        System.out.println(Arrays.toString(word3));

        String s4= "html,css, react";
        String[] word4=s4.split(",\\s*");
        System.out.println(Arrays.toString(word4));
        System.out.println(word4.length);

        String s5="dcba";
        String[] s6=s5.split("");
        Arrays.sort(s6);
        System.out.println(Arrays.toString(s6));

    }
}
