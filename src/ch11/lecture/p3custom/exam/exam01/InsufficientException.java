package ch11.lecture.p3custom.exam.exam01;

public class InsufficientException extends Exception{
    public InsufficientException(){

    }
    public InsufficientException(String message){
        super(message);
    }
}
