package ch11.lecture.p2throw;

import java.sql.SQLException;

public class C06Throw {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void method1() throws Exception{
        boolean b1=true;
        boolean b2=true;

        if (b1){
        throw new ClassNotFoundException();
        }
        if (b2){
        throw new SQLException();

        }

    }
}
