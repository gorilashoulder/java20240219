package sec01.solo;
import sec01.solo.*;
public class AnimalExample {
    public static void main(String[] args) {
        Whale whale=new Whale();
        Obj yourname=new Obj();
        Obj yourcolor=new Obj();
        yourname.setName("향유고래");
        yourcolor.setColor("핑크색");
        whale.breathe1();
        whale.eat();
        System.out.println("---------------");

        Cat cat=new Cat();
        cat.breathe1();
        cat.eat();
    }
}
