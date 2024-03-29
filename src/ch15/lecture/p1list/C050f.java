package ch15.lecture.p1list;

import java.util.List;

public class C050f {
    public static void main(String[] args) {
        //List.of로 수정 불가능한 리스트 객체 생성
        List<String> list =List.of();
        System.out.println(list.size());

        List<String> list2 =List.of("java");
        System.out.println(list2.size());
        System.out.println(list2);

        List<String> list3 =List.of("react","vue","jsp");
        System.out.println(list3);

        //중첩된 List
        List<List<Integer>> list4=List.of(
                List.of(95,86),
                List.of(83,92,96),
                List.of(78,83,93,87,88)
        );
        System.out.println(list4.get(0).get(1));
        System.out.println(list4.get(1).get(1));


    }
}
