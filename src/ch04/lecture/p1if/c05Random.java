package ch04.lecture.p1if;

import java.util.Random;

public class c05Random {
    public static void main(String[] args) {
        Random random= new Random();

       int dice1= random.nextInt(1,7);
       int dice2= random.nextInt(1,7);
       int dice3= random.nextInt(1,7);

        System.out.println(dice1);
    }
}
