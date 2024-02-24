package ch04.lecture.p2switch;

public class c08switchExpression {
    public static void main(String[] args) {
        String city = "서울";

        String area= switch (city){
            case "서울","도쿄"-> "아시아";
            case "런던","파리"-> "유럽";
            default -> "기타지역";
        };

        System.out.println(area);


    }
}
