package ch14.lecture.p2concurrency.exam.exam03;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizeMapExample {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer,String>map= Collections.synchronizedMap(new HashMap<>());

        Thread treadA=new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <=1000; i++) {
                    map.put(i,"내용"+i);
                }
            }
        };

        Thread treadB=new Thread(){
            @Override
            public void run() {
                for (int i = 1001; i <=2000; i++) {
                    map.put(i,"내용"+i);
                }
            }
        };

        treadA.start();
        treadB.start();

        treadA.join();
        treadB.join();

        int size=map.size();
        System.out.println("size = " + size);
        System.out.println();
    }
}
