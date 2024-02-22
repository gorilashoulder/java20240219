package c02.lecture.p02type;

import static java.util.FormatProcessor.FMT;

public class c29FormaString {
    public static void main(String[] args) {
        String name= "홍길동";
        String job="도적";

        //FMT Template Processor  d=숫자
        System.out.println(FMT."%-10s\{name}|\{job}");
    }
}
