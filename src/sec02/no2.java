package sec02;

public class no2 {
    public static void main(String[] args) {
        String grade="B";

       int result=100-20;
        Integer score1=switch(grade){
            case "A" ->100;
            case  "B" -> result;
            default -> 60;
        };

        System.out.println(score1);
    }
}
