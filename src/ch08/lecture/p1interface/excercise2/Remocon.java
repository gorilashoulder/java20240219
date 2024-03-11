package ch08.lecture.p1interface.excercise2;

public interface Remocon {
    public void powerOn();
}
class TV implements Remocon{
    @Override
    public void powerOn() {
        System.out.println("TV를 켰습니다");
    }

    public static void main(String[] args) {
        Remocon r= new TV();
        r.powerOn();
    }
}
