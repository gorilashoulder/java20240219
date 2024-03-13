package ch16.lecture.p1lamda.exam.exam02;

public class LamdaExample {
    public static void main(String[] args) {
        Person person=new Person();

        person.action(()-> {
            System.out.println("출근");
            System.out.println("퇴근");
        });

        person.action(() ->System.out.println("퇴근합니다"));
    }
}
