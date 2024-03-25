package ch11.lecture.p1exception;

import java.util.List;

public class C10Polymorphism {
    public static void main(String[] args) {

        try {
            Class.forName("java.lang.String"); //classnotfoundException
            List.of().get(0); //indexoutofboundexception
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
