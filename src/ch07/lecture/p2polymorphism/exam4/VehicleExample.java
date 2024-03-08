package ch07.lecture.p2polymorphism.exam4;

import ch06.lecture.p7access.exam01.package1.B;

public class VehicleExample {
    public static void main(String[] args) {
        Dirver driver =new Dirver();

        Bus bus=new Bus();
        driver.drive(bus);

        Taxi taxi=new Taxi();
        driver.drive(taxi);
    }
}
