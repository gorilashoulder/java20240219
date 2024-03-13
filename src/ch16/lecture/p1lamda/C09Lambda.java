package ch16.lecture.p1lamda;

//4.리턴이 있는 추상 메소드
public class C09Lambda {
    public static void main(String[] args) {
        C09MyI obj=new C09MyI() {
            @Override
            public int method() {
                System.out.println("statement....");
                return 0;
            }
        };

        C09MyI ob2= () -> {
            System.out.println("statement....");
            return 0;
        };

        C09MyI obj3=() -> {
          return 0;
        };

        C09MyI obj4=() -> 0;



    }
}

interface C09MyI{
    int method();
}
