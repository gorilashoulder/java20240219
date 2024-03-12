package ch09.lecture.p2anonymous.exam.exam03;

public class HomeExample {
    public static void main(String[] args) {
        Home home=new Home();

        home.use1();
        home.use2();
        home.use3(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("turn on heatter");
            }

            @Override
            public void turnOff() {
                System.out.println("turn off heatter");
            }
        });
    }
}
