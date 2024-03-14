package ch12.lecture.p2wrapper.example.exam02;

public class ValueCompareExample {
    public static void main(String[] args) {
        Integer obj1=300;
        Integer obj2=300;
        System.out.println(obj1==obj2);//false
        System.out.println(obj1.equals(obj2));//true
        System.out.println();

        //-128~127범위
        Integer obj3=10;
        Integer obj4=10;
        System.out.println(obj3==obj4);//false
        System.out.println(obj3.equals(obj4)); //true
    }
}
