package ch06.lecture.p3construtor.exam09;

public class CarExample {
    public static void main(String[] args) {
        Car myCar=new Car("포르쉐");
        Car yourCar=new Car("테슬라");

        myCar.run();
        yourCar.run();
    }
}
