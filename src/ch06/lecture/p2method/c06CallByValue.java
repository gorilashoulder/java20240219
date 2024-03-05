package ch06.lecture.p2method;

public class c06CallByValue {
    public static void main(String[] args) {
        c06Car car=new c06Car();
        car.name="tesla";
        car.printname();

        c06CarCenter center=new c06CarCenter();
        center.changeName(car);
        car.printname();

    }
}
class c06CarCenter{
    void changeName(c06Car car){
        car=new c06Car();
        car.name="kia";
    }
}
class c06Car{
    String name;

    void printname(){
        System.out.println(name);
    }
}
