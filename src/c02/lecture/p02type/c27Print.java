package c02.lecture.p02type;

import java.util.Scanner;

public class c27Print {
    public void main(String[] args) throws Exception{
        // System out . println()
        //() 안에 내용을 출력하고 새로운 줄로 마무리
        System.out.println("hello");
        System.out.println("hi");

        //System.out.print()
        //()안에 내용을 출력
        System.out.print(3);
        System.out.print("gd");

        System.out.println("-----");
/////////////////////////
        Scanner scanner=new Scanner(System.in);

        System.out.print("x값");
        String strX=scanner.nextLine();
        int x= Integer.parseInt(strX);

        System.out.print("y값");
        String strY=scanner.nextLine();
        int y= Integer.parseInt(strY);

        int result= x+y;
        System.out.println("x+y="+result);
        System.out.println();

        while (true){
            System.out.print("입력 문자열");
            String data= scanner.nextLine();
            if(data.equals("종료합니다")) {
                break;
            }
            System.out.println("출력 문자열"+data);
            System.out.println();
        }
        System.out.println("종료");

        scanner.close();
    }

    }

