package ch03.p1arithemetic;

public class c04Devide {
    public static void main(String[] args) {
        //정수 나누기 연산시 0으로 나누면 안됨
        int a=3;
        int b=0;

        if(b !=0) {
            int c = a / b;
            System.out.println(c);
        }
        if(b !=0) {
            int d = a % b;
            System.out.println(d);
        }
    }
}
