package ch07.lecture.p3casting.exam02;

public class Student extends Person{
    public int studentNo;

    public Student(String name, int studentNo){
        super(name);
        this.studentNo=studentNo;
    }

    public void study(){
        System.out.println("공부합시다");
    }
}
