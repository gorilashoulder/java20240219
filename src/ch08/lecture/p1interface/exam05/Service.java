package ch08.lecture.p1interface.exam05;

public interface Service {
    default void defaultMthod1(){
        System.out.println("default1 method 종속코드");
        defaultCommon();
    }

    default void defaultMthod2(){
        System.out.println("default2 method 종속코드");
        defaultCommon();
    }

    private void defaultCommon(){
        System.out.println("default method 중복코드A");
        System.out.println("default method 중복코드B");

    }
    static void staticMethod1(){
        System.out.println("staticMethod1 종속 코드");
        staticCommon();
    }
    static void staticMethod2(){
        System.out.println("staticMethod2 종속 코드");
        staticCommon();
    }

    private static void staticCommon(){
        System.out.println("static 메소드 중복코드1");
        System.out.println("static 메소드 중복코드2");
    }

}
