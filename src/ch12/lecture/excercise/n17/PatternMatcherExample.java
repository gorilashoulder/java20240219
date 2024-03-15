package ch12.lecture.excercise.n17;

import java.util.regex.Pattern;

public class PatternMatcherExample {
    public static void main(String[] args) {
        String id="asdfAA2sd";
        //String regExp="[a-zA-Z][\\w+]{8,12}";
        String regExp="[a-zA-Z][a-zA-Z0-9]{7,11}";
        boolean isMatch= Pattern.matches(regExp,id);
        if(isMatch){
            System.out.println("ID로 사용가능합니다");
        }else {
            System.out.println("ID로 못씁니다");
        }

    }
}
