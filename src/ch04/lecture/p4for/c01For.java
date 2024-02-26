package ch04.lecture.p4for;

public class c01For {
    public static void main(String[] args) {
        int a=0;
        while(a<3){
            System.out.println("명령문");
            a++;
        }
        System.out.println("________");

        for( int b=0 ; b< 3   ; b++ ){
            System.out.println("다른 명령문");
        }


    }
}
