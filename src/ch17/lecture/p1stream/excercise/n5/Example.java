package ch17.lecture.p1stream.excercise.n5;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String>list= Arrays.asList(
                "This is java book",
                "Lambda Expressions",
                "Java8 supports lambda expression"
        );
        list.stream()
                .filter(s->s.matches(".*[jJ][aA][vV][aA].*"))
                .forEach(System.out::println);
    }
}
