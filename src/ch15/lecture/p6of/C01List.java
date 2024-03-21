package ch15.lecture.p6of;

import java.util.ArrayList;
import java.util.List;

public class C01List {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("java");
        list.add("css");
        list.add("html");
        list.add("react");
        System.out.println(list);
        //수정가능
        list.add("spring");
        list.remove(0);
        list.set(1,"vue");
        System.out.println(list);

        List<String> list2 = List.of("java", "css", "html", "react");
        System.out.println(list2);
        //list2.set(1,"vue");
        //수정불가

    }
}
