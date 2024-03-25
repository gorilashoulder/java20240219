package ch11.lecture.p3custom.excercise.n7;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){}
    public WrongPasswordException(String message){
        super(message);
    }
}
