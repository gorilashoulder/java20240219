package ch07.lecture.p3casting;

public class C01Castingre {
    public static void main(String[] args) {
        C01Animal animal1=new C01Tiger();
        animal1.breathe();
        //강제형변환 :casting
        C01Tiger tiger=(C01Tiger) animal1;
        tiger.roar();

        C01Animal animal2=new C01Cat();

        animal2.breathe();
        //casting
        C01Cat cat=(C01Cat)animal2;
        cat.meow();
        System.out.println(System.identityHashCode(animal1));
        System.out.println(System.identityHashCode(tiger));
    }

}
class C01Animal{
    public void breathe(){
        System.out.println("숨쉽니다");
    }
}
class C01Tiger extends C01Animal{
    @Override
    public void breathe() {
        System.out.println("폐로 숨쉰다");
    }
    public void roar(){
        System.out.println("어흥!!!!!");
    }
}
class C01Cat extends C01Animal{
    @Override
    public void breathe() {
        System.out.println("고양이도 폐호흡함!");
    }
    public  void meow(){
        System.out.println("야옹~~~~");
    }
}

