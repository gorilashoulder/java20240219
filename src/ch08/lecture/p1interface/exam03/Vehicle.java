package ch08.lecture.p1interface.exam03;

public interface Vehicle {
    void run();
}
class Driver{
    void drive(Vehicle vehicle){
        vehicle.run();
    }
}
class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("버스달립니다");
    }
}
class Taxi implements Vehicle{
    @Override
    public void run() {
        System.out.println("택시달립니다");
    }
}