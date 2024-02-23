package ch04.lecture.p2switch;

public class c02switch {
    public static void main(String[] args) {
        //break 문 생략시 코드 실행은 계속됨

        System.out.println("Hello 1");

        String city ="seoul";

        switch (city){

            case "seoul":
            System.out.println("Hello 2");
            break;

            case "busan":
                System.out.println("Hello 3");
            break;

            case "jeju":
                System.out.println("Hello 4");
            break;
        }


        System.out.println("Hello 5");
    }
}
