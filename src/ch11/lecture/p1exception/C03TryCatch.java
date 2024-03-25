package ch11.lecture.p1exception;

import java.util.List;

public class C03TryCatch{
    public static void main(String[] args) {
        List<String> list = List.of("a", "B","2");

        String s1=list.get(0);


        //try:exception이 발생할 수 있는 코드를 감싼 블럭
        try {
            System.out.println("exception 발생 전 실행되는 코드들");
        String s2=list.get(2);

            System.out.println("---exception이 발생하지 않았으면 실행되는 코드들---");
        }catch (IndexOutOfBoundsException e){
            //catch: 발생한 exception을 잡고 처리하는 코드 블럭
            System.out.println("exception 발생 후 실행되는 코드들");
        }
        System.out.println("나머지 코드들");
    }
}
