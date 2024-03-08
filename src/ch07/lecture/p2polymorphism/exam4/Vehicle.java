package ch07.lecture.p2polymorphism.exam4;

public class Vehicle {
    public void run(){
        System.out.println("차량이 달립니다");
    }
}
class Bus extends Vehicle{
    @Override
    public void run() {
        System.out.println("버스가 달립니다");
    }
}
class Taxi extends Vehicle{
    @Override
    public void run() {
        System.out.println("택시가 달립니다");
    }
}
class Dirver{
    public void drive(Vehicle vehicle){
        vehicle.run();
    }
}