package ch09.lecture.p2anonymous.exam.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car car=new Car();
        car.run1();
        car.run2();
        car.run3(new Tire(){
            @Override
            public void roll() {
                System.out.println("anonymous child tire3 roll");
            }
        });
    }
}
