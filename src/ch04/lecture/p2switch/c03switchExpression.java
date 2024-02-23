package ch04.lecture.p2switch;

public class c03switchExpression {
    public static void main(String[] args) {
        // switch expression

        int value = 3;
        switch (value) {
            case 1 -> System.out.println("statement 1");
            case 2 -> System.out.println("statement 2");
            case 3 -> {
                System.out.println("statement 3");
                System.out.println("statement 4");

            }


        }
    }
}