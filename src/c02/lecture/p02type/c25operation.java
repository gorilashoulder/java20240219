package c02.lecture.p02type;

public class c25operation {
    public static void main(String[] args) {
        //정수간 연산의 결과는 정수
        int a=10;
        int b=5;
        int c = a/b;
        System.out.println(c);

        int d=10;
        int e=3;
        int f= d/e; //3
        System.out.println(f);

        double h=d/e;//3.3333 X
        System.out.println(h);

        double j=(double)d/e;
        System.out.println(j);
    }
}
