package ch17.lecture.p1stream;

import java.util.List;

public class C04Intermediate {
    public static void main(String[] args) {
        //중간 연산(intermediate operation)
        //filter,map,distinct,sorted,peek,limit,skip

        //중간연산은 최종연산이 있을 때만 실행

        List<Integer> list = List.of(3, 5, 6, 8, 9);
        long count1=list.stream().filter(e->{
            System.out.println(e);
            return true;
        }).count();
    }
}
