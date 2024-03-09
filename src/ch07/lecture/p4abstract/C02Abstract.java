package ch07.lecture.p4abstract;

public class C02Abstract {
    public static void main(String[] args) {
        C02Animal fish=new C02Fish();
        fish.breathe();
        C02Animal cat=new C02Cat();
        cat.breathe();

        C02Animal b3=new C02Bird();
    }
}
abstract class C02Animal{
    //abstract method:몸통 없는 메소드
    //하위 클래스가 꼭 재정의 되야함
    //추상메소드가 있다면 클래스는 꼭 추상 클래스
     abstract public void breathe();

}
class C02Fish extends C02Animal{
    @Override
    public void breathe() {
        System.out.println("아가미호흡");
    }
}
class C02Cat extends C02Animal{
    @Override
    public void breathe() {
        System.out.println("폐호흡");

    }
}
class C02Bird extends C02Animal{
    @Override
    public void breathe() {

    }
}

