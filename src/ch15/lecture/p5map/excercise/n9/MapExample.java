package ch15.lecture.p5map.excercise.n9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<String,Integer>();
        map.put("blue",96);
        map.put("hong",86);
        map.put("white",92);

        String name=null;
        int maxScore=0;
        int totalScore=0;

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for(Map.Entry<String,Integer>entry:entrySet){
            totalScore+=entry.getValue();
        }
        double avg=totalScore/map.size();
        System.out.println(avg);

        for(Map.Entry<String,Integer>entry:entrySet){
            if(maxScore<entry.getValue()){
                maxScore=entry.getValue();
                name= entry.getKey();
            }
        }
        System.out.println(name+"="+maxScore);



    }
}
