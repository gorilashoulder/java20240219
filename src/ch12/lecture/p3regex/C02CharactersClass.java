package ch12.lecture.p3regex;

public class C02CharactersClass {
    public static void main(String[] args) {
        //문자집합
        System.out.println("a".matches("[abc]"));
        System.out.println("b".matches("[abc]"));
        System.out.println("c".matches("[abc]"));
        System.out.println("A".matches("[abc]"));
        System.out.println("abc".matches("[abc]"));
        System.out.println("------------------------");

        System.out.println("abc".matches("[abc]"));
        String p1="[abc][abc][abc]";
        System.out.println("abc".matches(p1));
        System.out.println("bac".matches(p1));
        System.out.println("ccc".matches(p1));
        System.out.println("cab".matches(p1));
        System.out.println("------------------------");

        String p2="[a-z]";
        System.out.println("a".matches(p2));
        System.out.println("b".matches(p2));
        System.out.println("g".matches(p2));
        System.out.println("z".matches(p2));
        System.out.println("A".matches(p2));
        System.out.println("2".matches(p2));
        System.out.println("------------------------");

        String p3="[a-zA-z]";
        System.out.println("a".matches(p3));
        System.out.println("z".matches(p3));
        System.out.println("A".matches(p3));
        System.out.println("G".matches(p3));


        String p4="[a-zA-Z0-9]";
        String p5="[가-힣]";
        String p6="[^abc]"; ///a,b,c외
        System.out.println("a".matches(p6)); //f
        System.out.println("c".matches(p6)); //f
        System.out.println("d".matches(p6)); //t
        System.out.println("2".matches(p6)); //t

    }
}
