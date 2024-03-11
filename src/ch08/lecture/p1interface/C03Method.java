package ch08.lecture.p1interface;

public class C03Method {
    public static void main(String[] args) {
        C03Pet pet1=new C03Cat();
        C03Pet pet2=new C03GoldFish();

        pet1.feed();
        pet2.feed();
    }
}
interface C03Pet{
    //인터페이스의 메소드는 모두 public 추상 메소드
    //public, abstract 생략가능
    void feed();
}
abstract class C03Animal{
     abstract public void breathe();
}
class C03Cat extends C03Animal implements C03Pet{
    @Override
    public void breathe() {
        System.out.println("고양이가 폐로숨쉼");
    }

    @Override
    public void feed() {
        System.out.println("닭가슴살먹는다");
    }
}
class C03Tiger extends C03Animal{
    @Override
    public void breathe() {
        System.out.println("호랑이가 폐로숨쉼");
    }
}
class C03GoldFish extends C03Animal implements C03Pet{
    @Override
    public void breathe() {
        System.out.println("아가미로 숨쉼");
    }

    @Override
    public void feed() {
        System.out.println("새우를먹는다");
    }
}