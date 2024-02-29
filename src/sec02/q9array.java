package sec02;

import java.util.Scanner;

public class q9array {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        boolean run = true;



        while (run) {
            System.out.println("__________");
            System.out.println("1. 학생수 || 2.점수입력 || 3.점수리스트 || 4.분석 ||5.종료");
            System.out.println("__________");
            System.out.print("선택>");

            String strNum=scanner.nextLine();

            if(strNum.equals("1")){
                System.out.print("학생수>");
                String depositString= scanner.nextLine();
                int deposit= Integer.parseInt(depositString);
                int[]array=new int[deposit];
                System.out.println(array.length);
            }
            else if(strNum.equals("2")){
                System.out.print("score[0]");
                String score0String= scanner.nextLine();
                int score0= Integer.parseInt(score0String);

                System.out.print("score[1]");
                String score1String= scanner.nextLine();
                int score1= Integer.parseInt(score1String);
                System.out.print("score[2]");
                String score2String= scanner.nextLine();
                int score2= Integer.parseInt(score2String);
            }
            else if(strNum.equals("3")){

            }

        }

    }
}
