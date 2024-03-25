package ch11.lecture.p1exception.exam.exam04;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String [] array={"100","1oo",null,"200"};
        
        for (int i=0; i<= array.length; i++){
            try {
                int value=Integer.parseInt(array[i]);
                System.out.println("array"+i+" = " + value);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("e.getMessage() = " + e.getMessage());
            }catch (NullPointerException|NumberFormatException e){
                System.out.println("e.getMessage() = " + e.getMessage());
            }
        }
    }
}
