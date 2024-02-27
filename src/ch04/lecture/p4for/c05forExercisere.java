package ch04.lecture.p4for;

public class c05forExercisere {
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


        System.out.println("-----------------------");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < (5 - i); j++) {
                System.out.print("*");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }

        System.out.println("-----------------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (5 - i); j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("------------------");
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++, k++) {
                System.out.print(k%10);
            }
            System.out.println();
        }

        System.out.println("------------------");
        for(int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
