package ch06.lecture.p3construtor;

public class c02constructor {
    public static void main(String[] args) {
        c02myclass obj1 =new c02myclass();
        c02myclass obj2 =new c02myclass();

        System.out.println(obj1.age);
        System.out.println(obj2.age);
    }
}

class c02myclass{
    int age;

    c02myclass(){
        //필드 초기값 설정
        age=33;
    }
}
