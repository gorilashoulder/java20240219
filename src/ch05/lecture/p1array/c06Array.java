package ch05.lecture.p1array;

public class c06Array {
    public static void main(String[] args) {
        //배열 전체 탐색
        int[] arr=new int[]{7,2,10,4,-1,55,344,32,444,35352,5353,233};

        for(int i=0; i<8; i++){
            System.out.println(arr[i]);
        }
        System.out.println("------------------");

        //배열의 길이
        //배열명.legnth
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
