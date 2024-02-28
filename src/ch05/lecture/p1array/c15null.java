package ch05.lecture.p1array;

public class c15null {
    public static void main(String[] args) {
        //null: 참조하는 객체가 없다.
        //예제 그림

        int [] arr1 ={2,3,4};
        System.out.println(System.identityHashCode(arr1));

        int [] arr2 =null; //arr2가 참조변수가 참조하는 객체가 없다.
        System.out.println(System.identityHashCode(arr2));

        System.out.println(arr1.length);
        //System.out.println(arr2.length); //null의 속성(메소드)를 사용시 오류 발생

        arr1=null;
        System.out.println(System.identityHashCode(arr1));


    }
}
