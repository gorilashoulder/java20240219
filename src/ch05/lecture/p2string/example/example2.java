package ch05.lecture.p2string.example;

public class example2 {
    public static void main(String[] args) {
        String ssn= "9506241230123";
        char sex =ssn.charAt(6);
        switch (sex){
            case '1':
            case '3':
                System.out.println("남자");
                break;
            case '2':
            case '4':
                System.out.println("여자");
                break;

        }
    }
}
