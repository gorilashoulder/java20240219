package ch04.lecture.p2switch;

public class c05Switch {
    public static void main(String[] args) {
        String city ="인천";

        switch (city){
            case "서울":
            case "인천":
                //서울 .인천
                System.out.println("수도권");
                break;
            case "광주":
            case "전주":
                System.out.println("호남권");
                break;
            case "대구":
            case "부산":
                System.out.println("영남권");

        }


    }
}
