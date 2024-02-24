package ch04.lecture.p2switch;

public class c06switch {
    public static void main(String[] args) {

        String city ="서울";

        switch (city) {
            case "서울", "인천" -> System.out.println("수도권");
            case "광주", "전주" -> System.out.println("호남권");
            case "대구", "부산" ->
                   {System.out.println("영남권");
                    System.out.println("바다가 있다");}
            default -> System.out.println("강원도입니다");
        }
    }
}
