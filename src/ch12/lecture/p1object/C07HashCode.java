package ch12.lecture.p1object;

import java.util.Objects;

public class C07HashCode {
    public static void main(String[] args) {
        C07Myclass o1=new C07Myclass("this is java");
        C07Myclass o2=new C07Myclass("this is java");
        C07Myclass o3=new C07Myclass("spring boot");

        System.out.println(o1==o2); //false 참조값 다름
        System.out.println(o1.equals(o2)); //true equals메소드

    }
}
class C07Myclass{
    private String title;

    public C07Myclass(String title) {
        this.title = title;
    }

    //hashCode
    //1.같은 객체가 hashCode를 여러 번 호출해도
    //  같은 값이 나와야함
    //2.equals로 같은 객체로 여겨지면 두 객체의
    //    hashcode는 같아햐함
    //3.두 객체가 equals로 같지 않더라도
    // 두 객체의 hashcode는 같을 수도 있음 (다르면 더 좋다)

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        C07Myclass that = (C07Myclass) o;

        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }
}
