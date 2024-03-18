package ch15.lecture.p1list;

import java.util.ArrayList;
import java.util.List;

public class C02List {
    public static void main(String[] args) {
        //list :데이터의 순서(index) 가 있고 중복이 허용됨
        //빈 리스트 생성
        List<String> list1= new ArrayList<>();

        //element (요소,원소,item,)추가
        list1.add("java"); //index0
        list1.add("spring");//index1
        list1.add("react");//index2
        list1.add("css");//index3
        list1.add("spring"); //중복허용 //index4
        //list1.add(30);

        //element 읽기 (얻기 get)
        String s1=list1.get(2);
        System.out.println(s1); //react
        String s2= list1.get(1);
        System.out.println(s2); //spring

        //검색 (contains)

        System.out.println(list1.contains("spring"));
        System.out.println(list1.contains("java"));
        System.out.println(list1.contains("springboot"));


        //삭제 (remove)
        list1.remove("java" ); //true
        list1.remove("css" ); //true
        list1.remove("html" ); //false
        list1.remove("spring"); //true

        //전체탐색
        //고전적for
        for (int i=0; i< list1.size(); i++){
            System.out.println(list1.get(i));
        }

        //향상된 for
        System.out.println("-----향상된 for문");
        for(String item: list1){
            System.out.println(item);
        }

        //forEach,lamda
        System.out.println("foreach lamda");
        list1.forEach(System.out::println);
    }
}
