package ch08.lecture.p1interface.exam06;

public interface Vehicle {
    void run();
}
class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("버스간다");
    }

    public void checkFare(){
        System.out.println("승차요금 체크");
    }
}
class Taxi implements Vehicle{
    @Override
    public void run() {
        System.out.println("택시간다");
    }
}
