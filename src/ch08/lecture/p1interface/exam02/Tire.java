package ch08.lecture.p1interface.exam02;

public interface Tire {
    void roll();
}
class HankookTire implements Tire{
    @Override
    public void roll() {
        System.out.println("한국타이어가 굴러갑니다");
    }
}
class KumhoTire implements Tire{
    @Override
    public void roll() {
        System.out.println("금호타이어가 굴러갑니다");
    }
}
