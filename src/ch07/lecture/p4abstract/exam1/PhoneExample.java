package ch07.lecture.p4abstract.exam1;

import ch07.lecture.p1inheritance.exam1.Phone;

public class PhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone=new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSerch();
        smartPhone.turnOff();


    }
}
