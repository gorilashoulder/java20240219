package sec01.solo;
public class Animal {
    public void breathe1(){
        System.out.println("호흡합니다");
    }
    public void eat(){
        System.out.println("사냥을합니다");
    }
}
class Cat extends Animal{
    @Override
    public void breathe1() {
        System.out.println("폐 호흡합니다");
    }

    @Override
    public void eat() {
        System.out.println("사료를 먹습니다");
    }
}
class Panda extends Animal{
    @Override
    public void breathe1() {
        System.out.println("폐 호흡합니다");
    }
}
class Whale extends Animal{

    @Override
    public  void breathe1() {
        System.out.println("아가미 호흡합니다");
    }



}

class Obj{
    String name;
    String color;
    public void yournmae(String name, String color){
        this.name=name;
        this.color=color;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println(color);
    }
}
