package c02.lecture.p02type;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class c19Var {
    public static void main(String[] args) {
        //var : 변수의 타입을 할당되는 값으로부터 추론
        //따라서 변수의 선언과 할당을 동시에 해야함
        //지역변수에만 사용가능 (필드, 파라미터,리턴타입에서 사용 불가능)


        int a=10;
        var b=10; //b는 int 로 추론됨

        String c="hello";
        var d= "hi"; // d는 String 으로 추론

        //정수형 literal 은 int
        var i=100;
        //실수형 literal은 double
        var j=3.14;

        List<Map<String,Integer>> list= new ArrayList<Map<String, Integer>>();
        List<Map<String,Integer>> list2= new ArrayList<>();
        var list3= new ArrayList<Map<String, Integer>>();

        //변수명으로 사용하지 말자
        int var=3;

    }
}
