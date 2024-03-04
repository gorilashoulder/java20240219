package ch06.lecture.p1field;

public class c02field {
    public static void main(String[] args) {
        c02Car car1=new c02Car();
        car1.color ="검정";
        car1.weight=999.99;

        c02Car car2=new c02Car();
        car2.color ="파랑";
        car2.weight=888.88;


        System.out.println(car1.color);
        System.out.println(car1.weight);

        System.out.println(car2.color);
        System.out.println(car2.weight);

    }
}
