package ch11.lecture.p2throw;

public class C01throw {
    public static void main(String[] args) {


        //uncheked exception
        RuntimeException e = new RuntimeException();
        //throw :예외 던지기
        throw e;

        //System.out.println("코드실행안됨");

    }
}
