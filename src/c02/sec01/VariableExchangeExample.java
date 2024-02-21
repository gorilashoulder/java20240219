package c02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args){
        int x=3;
        int y=5;
        System.out.println("x:"+ x +",y:"+y);

        int temp= x;
        x = y ;
        y= temp;
        System.out.println("x:"+x+",y:"+y);

        int a=100;
        int b=200;

        int c=a;
        a=b;
        b=c;

        //적절한 코드 작성  swap a,b
        System.out.println(a); //200
        System.out.println(b); //100

        int e=300;
        int r=400;

        int tmep2=e;
        e=r;
        r=tmep2;

        System.out.println(e); //400
        System.out.println(r);//300


    }
}
