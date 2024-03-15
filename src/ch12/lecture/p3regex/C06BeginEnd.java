package ch12.lecture.p3regex;

public class C06BeginEnd {
    public static void main(String[] args) {
        // ^ (caret) : 시작
        // $ : 끝
        String s1=",,abc,def,,,xyz,,,";
        System.out.println(s1);
        String s=s1.replaceAll(",+","");
        System.out.println(s);

        String s2=s1.replaceAll("^","hi");
        System.out.println(s2);

        String s3=s1.replaceAll("^,+","");
        System.out.println(s3);

        String s4=s1.replaceAll("$","hello");
        System.out.println(s4);

        String s5=s1.replaceAll(",+$    ","hello");
        System.out.println(s5);
    }
}
