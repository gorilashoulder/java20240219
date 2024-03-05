package ch06.lecture.p3construtor;

public class c06this {
    public static void main(String[] args) {
        c06myclass o1=new c06myclass("son");
        System.out.println(o1.name);

        c06myclass o2=new c06myclass("lee");
        System.out.println(o2.name);
    }
}

class c06myclass{
    //this:현재 객체의 참조값

    String name;

    c06myclass(String name){
        this.name=name;
    }

}
