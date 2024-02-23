package ch02.lecture.p02type;

public class c23String {
    public static void main(String[] args) {
        //참조타입
        //기본타입 <--> 참조타입 간의 형변환 안됨
        // 기본타입 <--> String 메소드로 가능
        // 파싱 =데이터를 분해하고 분석해서 다른 형식으로 변환 과정

        //1.String  > 기본타입
        String a ="123";
        byte b= Byte.parseByte(a);
        short c=Short.parseShort(a);
        //char d;
        int e= Integer.parseInt(a);
        long f=Long.parseLong(a);
        float g=Float.parseFloat(a);
        double h= Double.parseDouble(a);

        System.out.println(b);
        System.out.println(c);


        //String  > 기본타입 파싱실패
        String i= "간나다";
//        int j = Integer.parseInt(i);
//        System.out.println(j);


        //2.기본타입 -> String 변환
        int k= 356;
        double l =3.14;

        String m= String.valueOf(k);
        String n= String.valueOf(l);

        System.out.println(m);
        System.out.println(n);

        //String과 다른타입간 더하기 연산의 결과는 String 이다 .
        String o = k + "";
        String p = l + "";
        System.out.println(o);
        System.out.println(p);

//        65쪽 예제
    }
}
