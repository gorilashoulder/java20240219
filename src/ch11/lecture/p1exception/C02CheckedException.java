package ch11.lecture.p1exception;

import java.util.List;

public class C02CheckedException {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b");
        //(unchked exception, 컴파일러가 검사안함)
        //컴파일러가 검사안함==예외처리 코드가 없어도됨
        System.out.println("list.get(2) = " + list.get(2));


        //(checked exception 컴파일러가 검사
        //예외처리 코드가 있는지 검사
        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
