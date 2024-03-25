package ch11.lecture.p2throw;

public class C03Throw {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //throws:메소드 선언부에 발생하는 예외 작성
    public static void someMethod() throws Exception{
        throw new Exception();//

    }
}
