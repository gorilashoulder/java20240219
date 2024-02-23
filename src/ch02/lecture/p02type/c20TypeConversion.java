package ch02.lecture.p02type;

public class c20TypeConversion {
    //정수형 :byte(1), short(2), int (4), long(8)
    //실수형 :float(4), double(8)
    //작은크기의 타입의 값을 큰크기의 타입의 변수에 할당 가능
    //반대는 안됨

    byte a= 23;
    int b= a; //ok
    short c= a; //ok
    long d= a ; //ok

    short e= 23;
    int f=e ;
    long g=e;
//    byte h=e; X

    int i=300;
    long j=i;
//    short k=i; X

    float l=3.14F;
    double m =l;

    double n=3.14;
//    float o=n; // X
public static void main(String[] args) {
 byte bytevalue=10;
 int intvalue= bytevalue;
    System.out.println("intvalue:"+ intvalue);

    char charvalue='가';
    intvalue =charvalue;
    System.out.println("가의 유니코드:"+ intvalue);

    intvalue=50;
    long longValue= intvalue;
    System.out.println("longvalue:"+intvalue);

}
}

