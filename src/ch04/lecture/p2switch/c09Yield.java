package ch04.lecture.p2switch;

public class c09Yield {
    public static void main(String[] args) {
        String city="paris";

        String area=switch (city){
            case "seoul","dokyo" -> "asia";
            case "paris","london" -> {

                System.out.println("statement 1");
                System.out.println("statement 2");
                yield "eu";//마지막에 존재
            }
            default -> "etc";
        };
        System.out.println(area);

        int length = 5;
        String shape = "원"; // 원, 정사각형

        double result = switch (shape) {
            case "원" -> {
                double calc = 3.14 * length * length;
                yield calc;
            }
            case "정사각형" -> length * length;
            default -> 0.0;
        };




    }

}
