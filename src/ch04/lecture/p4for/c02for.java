package ch04.lecture.p4for;

public class c02for {
    public static void main(String[] args) {
        for(int i= 0; i<3; i++){
            System.out.println("something"+ i);
        }

        for(int i=5; i>0; i--){
            System.out.println(i);
        }

        for(int i=0; i<10; i+=2){
            System.out.println("hello"+i);
        }

        for(int i=0 , j=5; i<3; i++,j--){
            System.out.println("hellp");
        }

        for(int i=0 ; i<3; i++){
            for(int j=0; j<5; j++){
                System.out.println("double");
            }
        }
    }
}
