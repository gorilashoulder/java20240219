package ch12.lecture.p3regex.exam.exam01;

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String regExp ="(02|010)-\\d{3,4}-\\d{4}"; // | :또는~
        String data ="02-123-4567";
        boolean result = Pattern.matches(regExp,data);
        if(result){
            System.out.println("일치");
        }else{
            System.out.println("불일치");
        }

        regExp="\\w+@\\W+\\.\\W+(\\.\\W+)?";
        data="angel@mycompanycom";
        result=Pattern.matches(regExp, data);
        if (result){
            System.out.println("일치");
        }else{
            System.out.println("불일치");
        }
    }
}
