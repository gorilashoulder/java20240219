package ch14.lecture.p2concurrency.exam.exam02;

import ch15.lecture.p1list.exam.exam01.Board;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) throws InterruptedException {
        List<Board>list=new Vector<>();

        Thread threadA=new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <=1000; i++) {
                    list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
                }
            }
        };

        Thread threadB=new Thread(){
            @Override
            public void run() {
                for (int i = 1001; i <=2000; i++) {
                    list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
                }
            }
        };

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        int size= list.size();
        System.out.println("총객체수="+size);
        System.out.println();


    }
}
