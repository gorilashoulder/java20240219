package ch06.lecture.p3construtor;

public class c03constructor {
    public static void main(String[] args) {
        c03myclass obj1=new c03myclass(44);
        c03myclass obj2=new c03myclass(66);

        System.out.println(obj1.age);
        System.out.println(obj2.age);

    }
}


class c03myclass{
    int age;

    c03myclass(int initialAge){
        age=initialAge;
    }
}
