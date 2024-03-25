package ch11.lecture.p1exception.exam.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            System.out.println("자바클래스가 존재합니다");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();

        try {
            Class.forName("java.lang.String2");
            System.out.println("자바클래스2가 존재합니다");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }



    }
}
