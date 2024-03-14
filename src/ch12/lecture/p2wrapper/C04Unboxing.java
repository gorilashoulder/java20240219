package ch12.lecture.p2wrapper;

public class C04Unboxing {
    public static void main(String[] args) {
        Integer a=3; //auto boxing


        //unboxing
        int c= a.intValue();//unboxing
        int b=a; // 현재 auto unboxing

        Long d=5L;
        long e=d;//auto unboxing
        double f=e;
        double g=d;

  //      Integer h=null; //null값 unboxing 불가
  //      int i =h; //auto unboxing;


        System.out.println("실행종료");
    }
}
