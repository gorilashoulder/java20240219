package ch05.lecture.p1array;

public class c05Arrayre {
    public static void main(String[] args) {
        //배열의 각 원소에 접근하는 법  :index 사용
        int[] arr= new int[]{100,200,400};
        //0번 index 100
        //1번 index 200
        //2번 index 400

        System.out.println(arr[0]);

        //존재하지 않는 Index 사용 불가
        System.out.println(arr[3]); //예외발생
    }
}
