package ch02.lecture.p02type;

public class c26Integer {
    public static void main(String[] args) {


        //byte short char 연산 result int
        byte a = 100;
        byte b = 100;
//    byte c= a+b;
        int c = a + b;

        //Example

        int v9 = 10;
        double result6 = v9 / 4.0;
        System.out.println(result6);

        int result1 = 10 + 8 + 2;
        System.out.println(result1);

        String result2 = 10 + 2 + "8";
        System.out.println(result2);

        String result3 = 10 + "2" + 8;
        System.out.println(result3);

        String result4 = "10" + (2+8);
        System.out.println(result4);
    }
}