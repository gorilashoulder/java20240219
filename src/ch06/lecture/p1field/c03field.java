package ch06.lecture.p1field;

public class c03field {
    public static void main(String[] args) {
        c03Car car1=new c03Car();
        System.out.println(car1.color);
        System.out.println(car1.price);

        c03Car car2=new c03Car();
        System.out.println(car2.color);
        System.out.println(car2.price);

        car2.color="red";
        car2.price=4000;

        System.out.println(car1.color);
        System.out.println(car1.price);
        System.out.println(car2.color);
        System.out.println(car2.price);
    }
}

//클래스는 보통 다른 파일에 작성
//강의 편의상 작성함
class c03Car {
    String color="black";
    int price= 3000;

}