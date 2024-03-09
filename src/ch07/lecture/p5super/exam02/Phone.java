package ch07.lecture.p5super.exam02;

public class Phone {
    String model;
    String color;

    Phone(){
        System.out.println("Phone 생성자 실행");
    }
}
class SmartPhone extends Phone{
    SmartPhone(String model, String color){
        super();
        this.model=model;
        this.color=color;
        System.out.println("SmartPhone생성자 실행");
    }
}
