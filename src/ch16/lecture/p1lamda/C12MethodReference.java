package ch16.lecture.p1lamda;

import java.util.List;

public class C12MethodReference {
    public static void main(String[] args) {
        C12MyI obj1=(x,y) ->C12OtherClass.method(x,y);
        C12MyI obj2=C12OtherClass::method;

//        List<Integer>list=List.of(9,10,1,3,27)
//                .stream()
//                .filter(x->(x%2)==1)
//                .toList();
//        System.out.println(list);

    }
}

class C12OtherClass{
    static int method(int c, int d){
        System.out.println("C12OtherClass.method");
        return 0;
    }
}

interface C12MyI{
    int method(int a, int b);
}
