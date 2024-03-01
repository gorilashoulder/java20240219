package ch05.lecture.p2string;

public class c04CharAt {
    public static void main(String[] args) {
        //index0= s
        //index1= o
        //index2= n
        String a="son";

        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(2));

        //char 타입 리턴
        char c =a.charAt(0);

        String b = """
                hello
                world
                """;
        System.out.println(b.charAt(0));
        System.out.println(b.charAt(6));
        System.out.println(b.charAt(b.length()-1));//엔터
    }
}
