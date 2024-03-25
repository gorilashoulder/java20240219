package ch11.lecture.p1exception.excercise.n6;

public class Exam06 {
    public static void main(String[] args) {
        String[] strArray={"10","2a"};
        int value=0;
        for (int i=0; i<=2; i++){
            try{
                value=Integer.parseInt(strArray[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("인덱스 초과");
            }catch (NumberFormatException e){
                System.out.println("숫자변환할 수 없음");
            }finally {
                System.out.println(value);
            }
        }
    }
}
//10,숫자변환,10,인덱스초과,10
