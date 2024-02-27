package ch05.lecture.p1array;

public class c07Array {
    public static void main(String[] args) {
        //배열 전체 탐색
        //향상된 for 문

        int arr[]=new int[]{1,2,3,5,6};

        //향상된 (enhanced) for 문

        for(int item: arr){
            System.out.println(item);
        }
    }
}
