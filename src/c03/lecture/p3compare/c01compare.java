package c03.lecture.p3compare;

public class c01compare {
    public static void main(String[] args) {
        //비교 연산자
        //== ,!=, > , >=, < , <=
        //연산 결과: boolean (true, false)
        //다른 타입과 연산 가능 (하지만 가능하면 같은 타입끼리 연산)
        int a=5;
        int b=8;
        boolean b1 = a == b;

        System.out.println(b1);

        boolean b2= a!= b;
        System.out.println(b2);

        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4);
        System.out.println("result5=" + result5);

        float num5 = 0.1f;
        double num6 = 0.1;
        boolean result6 = (num5 == num6);
        boolean result7 = (num5 == (float) num6);
        //실수 비교는 주의 ! 근사치 저장이기때문..
        System.out.println(result6);
        System.out.println(result7);
        
        String str1= "자바";
        String str2="Java";
        //String 비교는 equals ,, == 쓰지말기
        boolean result8 = (str1.equals(str2));
        boolean result9 = (! str1.equals(str2));
        System.out.println(result8);
        System.out.println("result9 = " + result9);

    }
}
