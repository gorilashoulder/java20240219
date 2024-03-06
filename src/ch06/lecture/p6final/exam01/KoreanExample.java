package ch06.lecture.p6final.exam01;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1=new Korean("123456-1234567","김자바");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        //k1.ssn=123-123;
        k1.name="김자바";
    }
}
