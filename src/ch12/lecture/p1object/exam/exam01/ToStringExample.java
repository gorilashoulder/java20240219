package ch12.lecture.p1object.exam.exam01;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone myPhone=new SmartPhone("SamSung","안드로이드");

        String obj=myPhone.toString();
        System.out.println(obj);
        System.out.println(myPhone);
    }
}
