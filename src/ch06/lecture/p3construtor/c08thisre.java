package ch06.lecture.p3construtor;

public class c08thisre {
}

class c08myclass{
    //필드
    String name;
    int age;

    String address;

    public c08myclass(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public c08myclass(String name) {
        //this():생성자 호출
        this(name,1,"없음");
        //this.name = name;
       // this.age=1;
        //this.address="없음";
    }
    //생성자
    public c08myclass(){
        this("홍길동",1,"없음");
        //this.name="홍길동";
        //this.age=1;
        //this.address="없음";
    }
}
