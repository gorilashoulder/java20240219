package ch11.lecture.p3custom;

public class C04Custom {
    public static void main(String[] args) throws LackofCaffeine{
        method1();
    }
    public static void method1() throws LackofCaffeine{
        throw new LackofCaffeine("카페인부족");
    }
}
class LackofCaffeine extends Exception{
    LackofCaffeine(){

    }
    LackofCaffeine (String message){
        super(message);
    }
}
