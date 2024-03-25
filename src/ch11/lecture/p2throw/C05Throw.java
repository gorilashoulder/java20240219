package ch11.lecture.p2throw;

public class C05Throw {
    public static void main(String[] args) throws ClassNotFoundException {
        somemethod3();
    }

    public static void somemethod3() throws ClassNotFoundException{
        somemethod2();
    }
    public static void somemethod2() throws ClassNotFoundException{
        somemethod1();
    }

    public static void somemethod1() throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }
}
