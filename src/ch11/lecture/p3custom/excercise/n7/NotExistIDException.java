package ch11.lecture.p3custom.excercise.n7;

public class NotExistIDException extends Exception{
    public NotExistIDException(){}
    public NotExistIDException (String message){
        super(message);
    }
}
