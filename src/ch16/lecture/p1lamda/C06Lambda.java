package ch16.lecture.p1lamda;

public class C06Lambda {

    //2.매개변수가 1개 있고 리턴이 없는 추상 메소드
    public static void main(String[] args) {
        C06MyI obj1=(a) -> {
            System.out.println(a);
            System.out.println("C06Lambda.main");
        };
        C06MyI obj2= a -> {
            System.out.println(a);
            System.out.println("C06Lambda.main");
        };

        C06MyI obj3= a -> System.out.println(a);
        C06MyI obj4= num -> System.out.println(num);
    }
}


interface C06MyI{
    void method(int a);
}

