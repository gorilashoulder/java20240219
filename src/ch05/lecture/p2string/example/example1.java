package ch05.lecture.p2string.example;

public class example1 {
    public static void main(String[] args) {
        String strvar1="홍길동";
        String strvar2="홍길동";

        if(strvar1==strvar2){
            System.out.println("str1,str2 참조가 같음");
        }else {
            System.out.println("str1,str2 참조가 다름");
        }

        if(strvar1.equals(strvar2)){
            System.out.println("str1,str2 문자열 같음");
        }

        String str3=new String("홍길동");
        String str4=new String("홍길동");

        if(str3==str4){
            System.out.println("3,4 참조같음");
        }else {
            System.out.println("3,4 참조다름");
        }

        if(str3.equals(str4)){
            System.out.println("3,4 문자열같음");
        }
    }
}
