package ch16.lecture.p1lamda;

//3.매개변수가 없고 리턴이 없는 추상 메소드
public class C08Lambda {
    public static void main(String[] args) {
        C08MyI obj=() -> {
                System.out.println("C08Lambda.method1");
                System.out.println("C08Lambda.method1");
            };

        C08MyI obj2= () -> {
            System.out.println("C08Lambda.main");
         };
        }
    }


@FunctionalInterface
interface C08MyI{
    void method1();
}
