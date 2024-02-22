package c02.lecture.p02type;

public class c28printf {
    public static void main(String[] args) {
        //System.out.printf()

        //파라미터1개 (print 와 유사)
        System.out.printf("hello world");

        System.out.println();
        //파라미터2개 이상
        //첫번째 파라미터 문자열에 두번째,세번째 ... 파라미터를 포함해서 출력
        System.out.printf("Hello %s","jane");

        System.out.println();

        //파라미터 3개
        System.out.printf("hello %s and %s","son","park");
        System.out.println();

        String a="son";
        String b="park";
        System.out.println(STR."hello \{a} and \{b}");

    }
}
