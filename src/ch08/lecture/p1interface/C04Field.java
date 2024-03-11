package ch08.lecture.p1interface;

public class C04Field {
}
interface C04MyInterface{
    public static void main(String[] args) {
        int a=C04MyInterface.AGE;
        System.out.println(C04MyInterface.NAME);
        System.out.println(C04MyInterface.MY_ADDRESS);
    }
    //field
    //모두 public static final
    int AGE=0;
    String NAME="son";
    String MY_ADDRESS="london";


    //public abstract
    void method1();
}
