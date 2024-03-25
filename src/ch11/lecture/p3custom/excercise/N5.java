package ch11.lecture.p3custom.excercise;

public class N5 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void method1()throws NumberFormatException,ClassNotFoundException{

    }
}
