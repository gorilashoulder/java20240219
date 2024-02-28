package ch05.lecture.p1array.example;

public class example8 {
    public static void main(String[] args) {
        String hobby ="여행";
        hobby =null;
        System.out.println(hobby);

        String kind1="자동차";
        String kind2=kind1;
        kind1 =null;
        System.out.println("kind2="+kind2);
    }
}
