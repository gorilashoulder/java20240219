package ch12.lecture.p1object.exam.exam01;

public class SmartPhone {
    String company;
    String os;

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString() {
        return company+"/"+os;
    }
}
