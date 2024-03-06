package ch06.lecture.p3construtor;

public class c09DefaultConstructor {
    public static void main(String[] args) {
        c09myclass1 obj=new c09myclass1(33);
        c09myclass2 obj2=new c09myclass2();
        c09myclass4 obj4=new c09myclass4();
        c09myclass4 obj5=new c09myclass4(2);

    }
}
class c09myclass4{
    int age;
//필요하면 만들어 써야함
    public c09myclass4(){

    }
    public c09myclass4(int age) {
        this.age = age;
    }
}
class c09myclass3{
    // 필드,생성자x
    //생성자를 작성하지 않으면
    //파라미터없는 생성자(기본생성자) 자동추가  no-args constructor (defaultconstructor)
    //단 생성자를 작성하면 추가되지 않는다.

    //메소드x
}
class c09myclass2{
    public c09myclass2(){

    }
}
class c09myclass1{
    int age;

    public c09myclass1(int age) {
        this.age = age;
    }
}
