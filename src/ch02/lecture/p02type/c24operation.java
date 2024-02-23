package ch02.lecture.p02type;

public class c24operation {
    public static void main(String[] args) {
        //같은 타입끼리의 연산의 결과는 피연산자의 타입
        int a =10 ;
        int b=10;
        int c = a+b; //결과 int

        //다른 타입끼리의 연산의 결과는 큰타입
        int g=10;
        long h=10;
        long i=g+h; //result long

        int j =10;
        double k =3.14;
        // j+K  result double

        //String and the other  type result = string
        int m=10;
        String n="10";
        String o = m+n;
        System.out.println(o);


    }
}
