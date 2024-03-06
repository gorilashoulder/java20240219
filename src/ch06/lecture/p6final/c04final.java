package ch06.lecture.p6final;

public class c04final {
    public static void main(String[] args) {
        c04myclass.i=30;
        c04myclass.i=50;
        //c04myclass.k=200; X
    }
}

class c04myclass{
    //static field
    static int i;

    //final static field
    //final static field 작명 관습:UPPER_SNAKE_CASE


    final static int k=100;
    final static int J;

    static {
        J=200;
    }
}
