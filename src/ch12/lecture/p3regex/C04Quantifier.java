package ch12.lecture.p3regex;

public class C04Quantifier {
    public static void main(String[] args) {
        //수량자
        //{n}: 정확히 n번
        //{n,m}: n~m번
        //{n, }:n번 이상
        //+ :{1,}: 1번 이상
        //* :{0,}: 0번 이상
        //? :{0,1}: 한번 또는 없음

        //{n} :n번
        String p1="\\d{3}";
        System.out.println("012".matches(p1)); //true
        System.out.println("064".matches(p1)); //true
        System.out.println("230".matches(p1)); //true
        System.out.println("993".matches(p1)); //true
        System.out.println("93".matches(p1)); //false

        System.out.println("--------------------");

        String p2="010-\\d{4}-\\d{4}";
        System.out.println("010-4040-2333".matches(p2)); //true
        System.out.println("010-4040-233".matches(p2)); //false
        System.out.println("310-4040-2333".matches(p2)); //false
        System.out.println("01040402333".matches(p2)); //false

        System.out.println("--------------------------------");

        //{n,m}
        String p3= "[가-힣]{3,4}";
        System.out.println("손흥민".matches(p3)); //true
        System.out.println("이강인".matches(p3)); //ture
        System.out.println("대한민국".matches(p3)); //ture
        System.out.println("한국".matches(p3)); //false
        System.out.println("서울특별시".matches(p3)); //false

        System.out.println("--------------------------------");
        //{n,}
        String p4="[가-힣]{2,}";
        System.out.println("손흥민".matches(p4)); // true
        System.out.println("대한민국".matches(p4)); // true
        System.out.println("대".matches(p4)); //flase
        System.out.println("대2".matches(p4)); //false

        System.out.println("p5--------------------------------");
        String p5="[a-zA-Z가-힣]{1,}";//영문대소문자와 한글 한글자 이상
        System.out.println("한국".matches(p5));
        System.out.println("korea".matches(p5));
        System.out.println("seoul한국".matches(p5));
        System.out.println("seoul 한국".matches(p5));

        System.out.println("--------------------------------");

        //?:{0,1}
        String p6 ="010-?\\d{4}-?\\d{4}";
        System.out.println("01099998888".matches(p6)); //true
        System.out.println("010-9999-8888".matches(p6)); //true
        System.out.println("010-4444-3358".matches(p6)); //true

        System.out.println("--------------------------------");
        //+: 1번 이상
        String p7 ="\\w+";
        System.out.println("9844f_".matches(p7)); //true
        System.out.println("".matches(p7)); //false

        System.out.println("--------------------------------");

        //*: 0번 이상
        String p8 ="\\w*";
        System.out.println("9844f_".matches(p8)); //true
        System.out.println("".matches(p8)); //true
    }
}
