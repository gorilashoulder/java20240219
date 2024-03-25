package ch11.lecture.p1exception;

import java.util.List;

public class C12Polymorphism {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            List.of().get(0);
            Integer.parseInt("hundred");
        } catch (NumberFormatException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }catch (Exception e){
            //catch 블럭순서중요
            System.out.println("코드2");
        }
    }
}
