package ch17.lecture.p1stream;

import java.util.List;

public class C03Terminal {
    public static void main(String[] args) {
        //최종 연산
        List<String> list = List.of("java", "css", "react", "spring", "hello world");

        //anyMatch
        boolean hascss = list.stream().anyMatch(e -> e.equals("css"));
        System.out.println("hascss = " + hascss);

        boolean hasjsp = list.stream().anyMatch(e -> e.equals("jsp"));
        System.out.println("hasjsp = " + hasjsp);

        boolean has = list.stream().anyMatch(e -> e.contains(" "));
        System.out.println("has = " + has);



        //allMatch
        boolean threeword = list.stream().allMatch(e -> e.length() >= 3);
        System.out.println(threeword);
    }
}
