package ch04.lecture.p3while.example;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        System.out.println("메세지 입력");
        System.out.println("q 입력시 종료");

        Scanner scanner=new Scanner(System.in);
        String inputString;

        do{
            System.out.print(">");
            inputString=scanner.nextLine();
            System.out.println(inputString);
        } while(! inputString.equals("q"));

        System.out.println();
        System.out.println("프로그램 종료");
    }
}
