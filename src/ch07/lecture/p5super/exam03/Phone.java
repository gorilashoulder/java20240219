package ch07.lecture.p5super.exam03;

public class Phone {
    String model;
    String color;

    Phone(String model, String color){
        this.model=model;
        this.color=color;
        System.out.println("Phone 생성자 실행");
    }
}
class SmartPhone extends Phone{
    SmartPhone(String model,String color){
        super(model,color);
        System.out.println("smartphone 생성자 실행");
    }
}
