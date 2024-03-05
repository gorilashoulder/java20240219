package ch06.lecture.p3construtor;

public class c01constructor {
    public static void main(String[] args) {

        System.out.println("111111");

        // new와 생성자 코드 실행으로 객체 생성
        c01myclass obj1=new c01myclass();
        c01myclass obj2=new c01myclass();
        c01myclass obj3=new c01myclass();

        System.out.println("22222");

    }
}

class  c01myclass{
    //필드

    //생성자! :constructor
    //객체 생성시 실행되는 코드블럭
    //생성자이름은 class이름과 동일
    //필요하면 파라미터 작성 가능
    c01myclass(){
        //객체 생성시 처음 실행되어야 하는 코드들
        //주로 필드값 초기화
        //초기설정
        System.out.println("객체 생성시 초기화 코드");
    }

    //메소드
}
