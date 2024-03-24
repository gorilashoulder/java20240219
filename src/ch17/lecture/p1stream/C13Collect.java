package ch17.lecture.p1stream;

import ch06.lecture.p7access.exam02.package1.A;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C13Collect {
    public static void main(String[] args) {
        List<String> list = List.of("java", "spring", "css", "html", "react");
        
        List<Integer> result1=new ArrayList<>();
        for(String s:list){
            result1.add(s.length());
        }
        System.out.println("result1 = " + result1);

        List<Integer> result2=list.stream()
                .collect(()->new ArrayList<Integer>(), (c,e)->c.add(e.length()), (a,b)->{});
        System.out.println("result2 = " + result2);


    }
}
