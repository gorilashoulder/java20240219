package ch06.lecture.p3construtor;

public class c04constructor {
    public static void main(String[] args) {
        c04myclass o1=new c04myclass("son",23);
        c04myclass o2=new c04myclass("sim",25);

        System.out.println(o1.name+o1.age);
        System.out.println(o2.name+o2.age);
    }
}


class c04myclass{
    String name;

    int age;

    c04myclass(String initialName, int initialAge){
        name=initialName;
        age=initialAge;
    }
}
