package ch04.lecture.p2switch;

import java.util.Random;
import java.util.Scanner;

public class c04RPS {
    public static void main(String[] args) {
        //가위바위보 만들기
        Scanner scanner =new Scanner(System.in);
        Random random=new Random();
        System.out.print("가위(1) , 바위 (2), 보(3) 를 선택하시오");

        int user = Integer.parseInt(scanner.nextLine());
        int computer = random.nextInt(1,4);

        switch (user) {
            case 1 -> System.out.println("가위");
            case 2 -> System.out.println("바위");
            default -> System.out.println("보");
        }

        switch (computer){
            case 1:
            System.out.println("가위");
            break;
            case 2:
                System.out.println("바위");
                break;
            case 3:

                System.out.println("보");

        }



        }



//        if(user==computer){
//            System.out.println("Draw");
//        }
//        else if(user==1&& computer==3){
//            System.out.println("User win");
//        }
//        else if(user==2&& computer==1){
//            System.out.println("User win");
//        }
//        else if(user==3&& computer==2){
//            System.out.println("User win");
//        }
//        else {
//            System.out.println(("computer win"));
//        }

    }

