package ch12.lecture.p1object.exam.exam02;

public class EqualsExample {
    public static void main(String[] args) {
        Member obj1=new Member("blue");
        Member obj2=new Member("blue");
        Member obj3=new Member("red");

        if(obj1.equals(obj2)){
            System.out.println("obj1과obj2는 동등합니다");
        }else{
            System.out.println("obj1과obj2는 다릅니다");
        }

        if(obj1.equals(obj3)){
            System.out.println("obj1과obj3은 동듭합니다");
        }else{
            System.out.println("obj1과obj3은 다릅니다");
        }
    }
}
