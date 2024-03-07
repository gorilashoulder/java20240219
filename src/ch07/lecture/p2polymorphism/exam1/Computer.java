package ch07.lecture.p2polymorphism.exam1;

public class Computer extends Calculator{
    @Override
    public double areaCircle(double r) {
        System.out.println("Computer객체의 areaCirecl()실행");
        return Math.PI*r*r;
    }
}
