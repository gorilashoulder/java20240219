package ch12.lecture.p1object;

public class C02String {
    public static void main(String[] args) {
        Object o1=new C02MyClass("son","london",23);
        System.out.println(o1.toString());
        System.out.println(o1);

        Object o2=new C02MyClass("lee","paris",20);
        System.out.println(o2.toString());
        System.out.println(o2);
    }

}

class C02MyClass{
    //필드
    private String name;
    private String address;
    private int age;

    //생성자

    public C02MyClass(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }


    //메소드

    //toString :필드값 정보를 리턴

    @Override
    public String toString() {
        return "C02MyClass{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
