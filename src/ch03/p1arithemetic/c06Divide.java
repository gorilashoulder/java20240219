package ch03.p1arithemetic;

public class c06Divide {
    public static void main(String[] args) {
        //실수(double)를 0으로 나누면 ... 결과 = infinity

        double a=3.0;
        double b=0.0;

        double c =a/b;
        System.out.println(c);

        double d=(-a)/b;
        System.out.println(d);

        double e=0.0;
        double f=-0.0;
        double g= a/e ; //infinity
        double h= a/f ;//-infinity
        System.out.println(g);
        System.out.println(h);

        //실수에서 % 나머지 연산을 하면 결과 = NaN (Not a Number)
        double i =3.0;
        double j=0.0;
        double k= i%j;
        System.out.println(k);

        //infinity 인지
           boolean l= Double.isFinite(g);
        System.out.println(l);

        //nan 인지
           boolean m= Double. isNaN(k);
        System.out.println(m);

        //infinity 와 연산결과는 infinity or NaN
        //NaN과 연산결과는 NaN
        double n=g-g;
        System.out.println(n);
        double o=g-100000000000000.0;
        System.out.println(o);

        System.out.println("--------------");

        int x=5;
        double y =0.0;
        double z =x/y;

        System.out.println(z+2);

        if(Double.isInfinite(z)||Double.isNaN(z)){
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z+2);
        }

    }
}
