package ch08.lecture.p1interface.exam02;

public class Car {
    Tire tire1 =new HankookTire();
    Tire tire2= new HankookTire();

    void run(){
        tire1.roll();
        tire2.roll();
    }
}
