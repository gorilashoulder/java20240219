package ch05.lecture.p1array.example;

public class example1 {
    public static void main(String[] args) {
        int [] arr1;
        int [] arr2;
        int [] arr3;

        arr1=new int[]{1,2,3};
        arr2=new int[]{1,2,3};
        arr3=arr2;

        System.out.println(arr1==arr2);
        System.out.println(arr2==arr3);
        System.out.println(System.identityHashCode(arr1));
        System.out.println(System.identityHashCode(arr2));
        System.out.println(System.identityHashCode(arr3));

    }
}
