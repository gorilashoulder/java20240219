package ch15.lecture.p2set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02Set {
    public static void main(String[] args) {
        //순서모름
        Set<String> set =new HashSet<>();
        set.add("java");
        set.add("css");
        set.add("spring");

        //전체탐색
        //향상된 for문
        System.out.println("-----향상된for문------");
        for(String item:set){
            System.out.println(item);
        }

        System.out.println("-----foreach문------");
        set.forEach(System.out::println);

        System.out.println("--------------------");
        //Iterator 사용
        //hashNext 탐색할 아이템이 있는지?
        //next 다음 아이템 리턴
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next= iterator.next();
            System.out.println(next);
        }


    }
}
