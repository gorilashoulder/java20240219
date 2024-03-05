package ch06.lecture.p3construtor;

public class c05overloading {
    public static void main(String[] args) {
        c05myclass o1=new c05myclass("son", 44);
        c05myclass o2=new c05myclass("son");
        c05myclass o3=new c05myclass(4);

        System.out.println(o1.name+o1.age);
        System.out.println(o2.name+o2.age);
        System.out.println(o3.name+o3.age);
    }
}

class c05myclass{
    String name;
    int age;


    //파라미터의 타입,갯수가 다르면 다른 생성자임
    c05myclass(String initialName, int initialAge){
        name=initialName;
        age=initialAge;
    }
    c05myclass(String initialName){
        name=initialName;
        age=1;
    }

    c05myclass(int initialAge){
        name="홍길동";
        age=initialAge;
    }
}
