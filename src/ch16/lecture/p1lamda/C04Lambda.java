package ch16.lecture.p1lamda;



public class C04Lambda {
    public static void main(String[] args) {


        C04MyI obj = (int a, int b) -> {
            System.out.println("메소드 몸체");
        };
        C04MyI obj2= (a,b) -> {
            System.out.println(a*b);
            System.out.println("Lambda");
        };
        C04MyI obj3= (a,b) -> System.out.println(a/b);

        obj.method(10,10);
        obj2.method(2,4);
        obj3.method(59,3);
    }
}


interface  C04MyI{
    void method(int a , int b);
}
//1.매개변수가 2개 이상 있고 리턴이 없는 추상 메소드
//2.매개변수가 1개     있고 리턴이 없는 추상 메소드
//3.매개변수가 없고 리턴이 없는 추상 메소드
//4,리턴이 있는 추상메소드