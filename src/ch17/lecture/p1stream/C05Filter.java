package ch17.lecture.p1stream;

import java.util.List;

public class C05Filter {
    public static void main(String[] args) {
        List<Integer> list = List.of(9, 6, 3, 0, 132, 33, 45);
        //filter: 특정 요소만 filtering

        long count=list.stream()
                .filter(e->e%2==0)
                .count();
        System.out.println(count);

        long count1=list.stream()
                .filter(e->e%2==1)
                .count();
        System.out.println(count1);

    }
}
