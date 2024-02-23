package c03.lecture.p1arithemetic;

public class c02arithmetic {
    public static void main(String[] args) {
        //증감연산자
        //  ++ --
        //피연산자 :1개
        //연산의 결과타입: 피연산자의 타입
        //연산의 결과값
        //1.피연산자의 값: 피연산자가 앞에 올때
        //2.(피연산자의 값 +1) 또는 (피연산자의 값의 -1) : 피연산자가 뒤에 올때

        //***연산시 피연산자의 값이 1증가 또는 1감소
        int a=10;
        int a1=a++;
        System.out.println(a1);
        System.out.println(a);

        int b=10;
        int b1=++b;
        System.out.println(b1);
        System.out.println(b);

        int c=10;
        int c1= c--;
        System.out.println(c1);
        System.out.println(c);

        int x= 10;
        int y= 10;
        int z;
        System.out.println();

        x++;
        ++x;
        System.out.println("x="+x);

        System.out.println("-------");
        y--;
        --y;
        System.out.println("y=" +y );

        System.out.println("-------");
        z= x++;
        System.out.println("z="+z);
        System.out.println("x="+x);

        System.out.println("--------");
        z= ++x;
        System.out.println("z="+z);
        System.out.println("x="+x);

        System.out.println("--------");
        z= ++x + y++;
        System.out.println("z="+z);
        System.out.println("x="+x);
        System.out.println("y=" +y);

        int g=10;
        int q=20;
        int v= (++g)+ (q--); // 11 .. 20
        System.out.println(v);
        System.out.println(q);
    }
}
