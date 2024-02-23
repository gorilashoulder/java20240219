package c03.lecture.p4logical;

public class c05ShortCircuit {
    public static void main(String[] args) {
        int i =10;
       boolean b1= (i++)==10 || (i++) ==30;
        System.out.println(b1);
        System.out.println(i);


        i = 10;
        boolean b2 = (i++) == 30 || (i++) == 40;
        System.out.println("b2 = " + b2);
        System.out.println("i = " + i);

        i = 10;
        boolean b3 = (i++) == 10 | (i++) == 30;
        System.out.println("b3 = " + b3);
        System.out.println("i = " + i); // 12

        System.out.println("---------------");
        int x=10;
        int y=5;
        System.out.println((x>7) && (y<=5));
        System.out.println( (x%3==2) || (y%2 != 1));
    }
}
