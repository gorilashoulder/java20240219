package ch08.lecture.p1interface.exam05;

public class ServiceExample {
    public static void main(String[] args) {
        Service service=new ServiceImpl();

        service.defaultMthod1();
        System.out.println();
        service.defaultMthod2();
        System.out.println();


        Service.staticMethod1();
        System.out.println();
        Service.staticMethod2();
        System.out.println();
    }
}
