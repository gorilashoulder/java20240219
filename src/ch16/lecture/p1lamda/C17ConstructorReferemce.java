package ch16.lecture.p1lamda;

import java.awt.*;

public class C17ConstructorReferemce {
    public static void main(String[] args) {
        C17MyInterface1 obj1= C17Myclass::new;
    }
}
class C17Myclass{

}
interface C17MyInterface1{
    C17Myclass method();
}
