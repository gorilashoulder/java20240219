package ch11.lecture.p2throw.exam.exam01;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("e.toString() = " + e.toString());
        }
    }
    
    public static void findClass() throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }
}
