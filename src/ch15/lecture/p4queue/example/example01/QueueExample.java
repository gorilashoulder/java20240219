package ch15.lecture.p4queue.example.example01;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message>messageQueue=new LinkedList<>();

        messageQueue.offer(new Message("sendmail","홍길동"));
        messageQueue.offer(new Message("sendsms","신용권"));
        messageQueue.offer(new Message("sendkakaotalk","김자바"));

        while (!messageQueue.isEmpty()){
            Message message=messageQueue.poll();
            switch (message.command){
                case "sendmail":
                    System.out.println(message.to+"님에게 메일을보냅니다");
                    break;
                case "sendsms":
                    System.out.println(message.to+"님에게 sms을보냅니다");
                    break;
                case "sendkakaotalk":
                    System.out.println(message.to+"님에게 카톡을보냅니다");
                    break;
            }
        }
    }
}
