package ch15.lecture.p5map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01Map {
    public static void main(String[] args) {
        //map: entry(key, value) 를저장
        // 같은 key를 가진 두 개의 entry를 저장할수 없음

        Map <String,String> map=new HashMap<>();
        //entry 추가
        map.put("java","programming language");
        map.put("css","style sheet");
        map.put("html","에체테멜");
        map.put("spring","java framework");
        map.put("react","frontnend library");
        map.put("css","style sheet");

        //entry검색
        System.out.println(map.size());
        boolean b1 = map.containsKey("java");
        boolean b2 = map.containsKey("css");
        boolean b3 = map.containsKey("jsp");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println("------------------");

        //entry의 value얻기
        String value1 = map.get("java");
        String value2 = map.get("css");

        System.out.println(value1);
        System.out.println(value2);

        String value3 = map.get("javaScript");
        System.out.println(value3);

        System.out.println("------------------");
        //entry 수정
        map.put("java", "프로그래밍언어");
        String value4=map.get("java");
        System.out.println(value4);

        if(map.containsKey("css")){
            map.put("css","스타일시트");
        }
        if (map.containsKey("jsp")) {
            map.put("jsp", "java server page");
        }
        System.out.println("map.get(\"css\") = " + map.get("css"));
        System.out.println("map.get(\"jsp\") = " + map.get("jsp"));


        System.out.println("------------------");

        //entry 지우기
        System.out.println(map.size());
        String value6=map.remove("css");
        System.out.println(map.size());
        String value7=map.remove("jss");
        System.out.println(map.size());
        System.out.println(value6);
        System.out.println(value7);

        System.out.println("-----------------------");

        //map 크기

        //전체탐색
        //1.keySet
        Set<String>keys=map.keySet();
        //forEach
        //Iterator
        //enhanced for
        for(String key:keys){
            System.out.println(key+":"+map.get(key));
        }

        //2.entrySet
        System.out.println("------entrySet------");
        Set<Map.Entry<String,String>> entries=map.entrySet();
        //forEach
        //enhanced for
        for(Map.Entry<String,String>entry: entries){
            System.out.println(entry.getKey()+entry.getValue());
        }



        //3.forEach
        System.out.println("----------foreach=======");
        map.forEach((x,y)-> System.out.println(x+y));

    }
}
