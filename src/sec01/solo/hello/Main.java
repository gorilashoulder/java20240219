package sec01.solo.hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Team fcBar = new Team("바르셀로나","스페인","바르셀로나");
        Team manUnited = new Team("맨유","잉글랜드","맨유");
        Team realMadrid = new Team("레알마드리드","스페인","마드리드");


        Player rolnaldo = new Player("ronaldo",7,80,180,2200,manUnited);
        Player zidane = new Player("ziDane",5,70,185,2200,realMadrid);
        Player messi = new Player("meSsi",7,80,180,2200,fcBar);
        Player iniesta = new Player("iniEsta",7,80,180,2200,fcBar);


        List<Player> playerList = new ArrayList<>();
        List<Player> resultPlayerList = new ArrayList<>();
        playerList.add(rolnaldo);
        playerList.add(zidane);
        playerList.add(messi);
        playerList.add(iniesta);

        Scanner scanner=new Scanner(System.in);
        boolean run=true;


        while (run){
            System.out.println("팀을 고르시오 : 1.바르셀로나 , 2.레알마드리드, 3.맨유 4.종료");
            System.out.println("선택->");
            String strNum=scanner.nextLine();

            if (strNum.equals("4")) {
                System.out.println("시스템 종료....");
                break;
            }

            System.out.println(strNum + "의 소속선수는" );
            for (Player p : playerList) {
                switch (strNum) {
                    case "1":
                        if (p.isBarsh()) {
                            resultPlayerList.add(p);
                            System.out.println(p.toString());
                        }
                        break;
                    case "2":
                        if (p.isRealMadrid()) {
                            resultPlayerList.add(p);
                            System.out.println(p.toString());
                        }
                        break;
                    case "3":
                        if (p.isManU()) {
                            resultPlayerList.add(p);
                            System.out.println(p.toString());
                        }
                        break;
                }
            }
            System.out.println("가 있습니다.");

        }
    }
}
