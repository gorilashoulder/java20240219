package ch16.lecture.p1lamda.exam.exam01;

import ch16.lecture.p1lamda.exam.exam01.Speakable;
import ch16.lecture.p1lamda.exam.exam01.Workable;

public class Person {


    public void action1(Workable workable){
        workable.work("홍길동","프로그래머");
    }

    public void action2(Speakable speakable){
        speakable.speak("안녕하세요");
    }
}
