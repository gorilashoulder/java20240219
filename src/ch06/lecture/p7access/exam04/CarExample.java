package ch06.lecture.p7access.exam04;

public class CarExample {
    public static void main(String[] args) {
        Car myCar=new Car();

        myCar.setSpeed(-50);
        System.out.println("now speed"+myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println("now speed"+myCar.getSpeed());

        if(!myCar.isStop()){
            myCar.setStop(true);
        }
        System.out.println("now speed"+myCar.getSpeed());
    }
}
