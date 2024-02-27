package sec02;

import java.util.Scanner;

public class no7result {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean run=true;
        int money=0;
        while(run){

            System.out.println("-----------");
            System.out.print("1.입력");
            System.out.print("2.출금");
            System.out.print("3.잔고");
            System.out.println("4.종료");
            System.out.println("-----------");
            System.out.println("선택>");

            String menu=scanner.nextLine();

            switch(menu){
                case "1" ->{
                    System.out.println("예금액>");
                    String depositString= scanner.nextLine();
                        int deposit= Integer.parseInt(depositString);
                    money += deposit;
                }

                case "2"->{
                    System.out.println("출금액>");
                    String withdrawalString= scanner.nextLine();
                    int withdrawl=Integer.parseInt(withdrawalString);
                    money-=withdrawl;
                }

                case "3" -> {
                    System.out.println(STR."잔고\{money}");
                }

                case "4" -> {
                    run=false;
                }
            }
        }

        System.out.println("프로그램 종료");
        Scanner close;
    }
}
