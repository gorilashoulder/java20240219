package ch05.lecture.p1array;

import java.util.Scanner;

public class c21Scanner {
    public static void main(String[] args) {
        String s1="my name is son";
        Scanner scanner=new Scanner(s1);

        String token1= scanner.next();
        String token2= scanner.next();
        String token3= scanner.next();
        String token4= scanner.next();

        System.out.println(token1);
        System.out.println(token2);
        System.out.println(token3);
        System.out.println(token4);


    }
}
