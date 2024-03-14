package ch12.lecture.p2wrapper;

public class C05Compare {
    public static void main(String[] args) {
        int a=60000;
        int b=60000;
        System.out.println(a==b);

        Integer c=70000;
        Integer d=70000;
        System.out.println(c==d);
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));

        //***********************************
        //참조타입 비교는 equals 사용!!!!!!!!!!

        System.out.println(c.equals(d));

    }
}
