package ch17.lecture.p1stream;

import java.util.List;

public class C08Map {
    //map: 각 요소를 다른 요소로 반환하는 중간연산
    public static void main(String[] args) {
        List<String> list = List.of("java", "html", "css", "spring", "hello world");
        list.stream()
                .map(e->e.substring(0,1))
                .forEach(System.out::println);

        System.out.println();

        list.stream()
                .map(e->e.length())
                .forEach(System.out::println);
    }
}
