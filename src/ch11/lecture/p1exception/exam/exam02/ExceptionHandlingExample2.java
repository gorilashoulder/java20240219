package ch11.lecture.p1exception.exam.exam02;

public class ExceptionHandlingExample2 {
    public static void printLength(String data) {

        try {
           int result = data.length();
        System.out.println("result = " + result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("마무리실행");
        }
    }

    public static void main(String[] args) {
        System.out.println("프로그램시작");
        printLength("ThisJava");
        printLength(null);
        System.out.println("프로그램종료");
    }
}
