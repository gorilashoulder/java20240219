package ch12.lecture.p2wrapper.example.exam01;

import org.w3c.dom.ls.LSOutput;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        Integer obj=100;
        System.out.println("value="+obj.intValue());

        int value= obj;
        System.out.println("value="+ value);

        int reuslt= obj+100;
        System.out.println(reuslt);
    }
}
