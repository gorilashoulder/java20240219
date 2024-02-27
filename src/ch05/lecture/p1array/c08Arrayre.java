package ch05.lecture.p1array;

public class c08Arrayre {
    public static void main(String[] args) {
        int arr[]= new int[]{1,2,3,4,5,642};

        for(int i= 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("---------------");
            ///두배한값
        for(int i= 0; i<arr.length; i++){
            System.out.println(arr[i]*2);
        }

        System.out.println("----------");
        for (int item:arr){
            System.out.println(item);
        }

        //각 원소를 두배한 값으로 교체

    }
}
