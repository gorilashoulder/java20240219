package ch15.lecture.p4queue;

import java.util.LinkedList;
import java.util.Queue;

public class C01Queue {
    public static void main(String[] args) {
        Queue<String>queue=new LinkedList<>();

        //아이템 추가(offer)
        queue.offer("java");
        queue.offer("spring");
        queue.offer("jdbc");
        queue.offer("mariadb");

        for(String que:queue){
            System.out.println(que);
        }

        System.out.println(queue.size());//4

        //아이템 삭제(poll)
        String e1=queue.poll();
        String e2=queue.poll();
        String e3=queue.poll();
        String e4=queue.poll();

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(queue.size());
    }
}
