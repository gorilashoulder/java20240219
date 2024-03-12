package ch09.lecture.p2anonymous;


import java.util.Random;

public class C07Sample {
    public static void main(String[] args) {
        //TODO:null 대신 익명클래스 객체 코드 작성

        Game rpsGame=new Game() {
            @Override
            public void play() {
                String [] rps={"주먹","가위","바위"};
                int random= new Random().nextInt(rps.length);
                System.out.println(rps[random]);
            }
        };
        rpsGame.play();//가위 바위 보 중 하나 출력

        Game lottoGame=new Game() {
            @Override
            public void play() {
//                int[] lotto=new int[45];
                int random=new Random().nextInt(45)+1;
                System.out.println(random);
            }
        };
        //초보자 :1~45 값 중 한개 출ㄹ력
        lottoGame.play();
    }
}

interface Game{
    void play();
}
