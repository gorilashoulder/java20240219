package ch07.lecture.p5super.exam01;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa=new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flymode=SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flymode=SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();;
    }
}
