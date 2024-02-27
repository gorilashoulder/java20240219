package sec02;

import java.util.Scanner;

public class no7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Integer inputInteger;

        System.out.println("-----------");
        System.out.print("1.입력");
        System.out.print("2.출금");
        System.out.print("3.잔고");
        System.out.println("4.종료");
        System.out.println("-----------");

        do{
            System.out.println("선택>");
            inputInteger= scanner.nextInt();
        }while(! inputInteger.equals(4));


    }


}
