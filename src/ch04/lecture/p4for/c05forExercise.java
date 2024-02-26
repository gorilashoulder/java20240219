package ch04.lecture.p4for;

public class c05forExercise {
    public static void main(String[] args) {
        /*
        *****
        *****
        *****
        *****
        *****
         */
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------");

        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------");

        for(int i=0 ; i<5; i++){
            for(int j=5; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------");

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print("");
            }
            System.out.println();
        }

    }
}
