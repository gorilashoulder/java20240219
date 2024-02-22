package c02.lecture.p02type;

public class c21Typeconversion {
    public static void main(String[] args) {


        //자동타입변환 : 작은크기 - 큰크기
        //강제타입변환 : 큰크기 - 작은크기


        long a = 234;
        int b = (int) a; //x 강제 타입변환 casting;

        System.out.println(a);
        System.out.println(b);

        short c=50;
        byte d= (byte)c; //x
        System.out.println(c);
        System.out.println(d);

        double var2= 3.14;
        int var3= (int)var2;
        System.out.println(var3);
        //소수점 이하 탈락

        byte bytevalue= 10;
        int intvalue= bytevalue;
        System.out.println(intvalue);
    }
}
