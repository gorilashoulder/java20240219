package ch07.lecture.p2polymorphism.exam3;

public class CarExample {
    public static void main(String[] args) {
        Car myCar=new Car();

        myCar.tire=new Tire();
        myCar.run();

        myCar.tire=new HankookTrie();
        myCar.run();

        myCar.tire=new KumhoTire();
        myCar.run();
    }
}
