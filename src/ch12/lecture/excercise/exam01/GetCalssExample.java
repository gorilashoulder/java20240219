package ch12.lecture.excercise.exam01;

public class GetCalssExample {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz =Car.class;

        //Class clazz= Class.forName("ch12.lecture.excercise.exam01.Car");

        Car car= new Car();
        //Class clazz =car.getClass();
        System.out.println(" clazz.getName() = " +  clazz.getName());
        System.out.println(" clazz.getName() = " +  clazz.getPackageName());

    }
}
