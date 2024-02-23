package ch04.lecture.p2switch;

public class c01switch {
    public static void main(String[] args) {
        System.out.println("statement 1");

        //값이 " 서울 "
        String city="부산";

        switch (city){
            case "서울":
                System.out.println("statement 2");
                break;
            //값이 "제주"
            case "제주":
                System.out.println("statement 3");
                break;

                //값이 "부산"
            case "부산":
                System.out.println("statement 4");
                System.out.println("statement 4-1");
                break;


            default: //     위의 모든 case에 해당 X
                System.out.println("statement 5");
                break;
        }



    }
}
