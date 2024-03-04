package ch06.lecture.p1field.sec06.exam02;

public class CarExample {
    public static void main(String[] args) {
        //객체 생성
        Car myCar= new Car();

        //Car 객체 필드값 읽기
        System.out.println("회사="+ myCar.company);
        System.out.println("모델="+myCar.mondel);
        System.out.println("색깔="+myCar.color);
        System.out.println("최고속도="+myCar.maxSpeed);
        System.out.println("현재속도="+myCar.speed);

        //Car 객체 필드값 변경
        myCar.speed=50;
        System.out.println("수정된 속도="+ myCar.speed);
    }
}
