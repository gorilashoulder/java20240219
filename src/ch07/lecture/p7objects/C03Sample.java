package ch07.lecture.p7objects;

public class C03Sample {
    public static void main(String[] args) {
        Shape shape1=new Round(3); //반지름 3
        Shape shape2=new Rectangle(5,7); //가로 5 ,세로 7
        shape1.printArea(); //원의 면적 28.2748
        shape2.printArea();//사각형의 면적출력 35

        printDescription(shape1);
        printDescription(shape2);
    }


        public static void printDescription(Object o){
            System.out.println(o.toString());
    }
}
abstract class Shape{
    public abstract void printArea();
}


class Round extends Shape{
    double radius;
    public Round(double radius) {
        this.radius=radius;
    }

    @Override
    public void printArea() {
        double area=radius*radius*Math.PI;
        System.out.println(area);
    }
}


class Rectangle extends Shape{
    double width;
    double height;
    public Rectangle(double width ,double height) {
        this.width=width;
        this.height=height;
    }

    @Override
    public void printArea() {
        double area=width*height;
        System.out.println(area);
    }
}
