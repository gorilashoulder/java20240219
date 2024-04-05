package ch12.lecture.p5annotation.exam.exam01;

public class Service {
    @PrintAnnotation
    public void method1(){
        System.out.println("실행내용1");
    }
    @PrintAnnotation
    public void method2(){
        System.out.println("실행내용2");
    }

    @PrintAnnotation
    public void method3(){
        System.out.println("실행내용3");
    }
}
