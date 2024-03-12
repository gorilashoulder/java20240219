package ch09.lecture.p2anonymous;

import java.util.Random;

public class C07Sample {
    public static void main(String[] args) {
        //TODO:null 대신 익명클래스 객체 코드 작성

        Game rpsGame=null;
        rpsGame.play();//가위 바위 보 중 하나 출력

        Game lottoGame=null;
        //초보자 :1~45 값 중 한개 출ㄹ력
        lottoGame.play();
    }
}

interface Game{
    void play();
}
