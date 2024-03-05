package ch06.lecture.p3construtor;

public class c07this {
}

class c07myclass{
    String name;

    void method1(){
        System.out.println(name);
        System.out.println(this.name);
        method2();
        this.method2();
    }

    void method2(){

    }
}
