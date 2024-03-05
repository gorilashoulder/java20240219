package ch06.lecture.p2method;

public class c03Method {
    public static void main(String[] args) {
        c04Person john=new c04Person();
        c04Person jane=new c04Person();

        john.name="john";
        jane.name="jane";

        john.run();
        jane.walk();

        john.walk();
        jane.run();
    }
}
class c04Person{
    String name;

    void run(){
        System.out.println(name+"이 달립니다");
    }
    void walk(){
        System.out.println(name+"이 걷습니다");
    }

}
