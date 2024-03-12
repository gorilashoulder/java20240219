package ch09.lecture.p2anonymous.exam.exam03;

public class Home {

    private RemoteControl rc=new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("turn on tv");
        }

        @Override
        public void turnOff() {
            System.out.println("turn off tv");
        }
    };

    public void use1(){
        rc.turnOn();
        rc.turnOff();
    }

    public void use2(){
        RemoteControl rc= new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("turn on airconditional");
            }

            @Override
            public void turnOff() {
                System.out.println("turn off airconditional");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }
    public void use3(RemoteControl rc){
        rc.turnOn();
        rc.turnOff();
    }
}
