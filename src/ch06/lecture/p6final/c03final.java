package ch06.lecture.p6final;

public class c03final {
    public static void main(String[] args) {
        c03myclass o=new c03myclass();
        System.out.println(o.i);
        o.i=3;
        System.out.println(o.i);
        o.i=4;
        System.out.println(o.j);
        // o.j=11; X
        System.out.println(o.k);
    }
}

class c03myclass{
    int i;

//    final 인스턴스 필드
    final int j=10;
    final int k;

    c03myclass(){
        //생성자에서 인스턴스 필드 초기화
        this.k=200;
    }
}
