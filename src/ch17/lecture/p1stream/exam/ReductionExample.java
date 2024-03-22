package ch17.lecture.p1stream.exam;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student>studentsList= Arrays.asList(
                new Student("홍길동",92),
                new Student("신용권",95),
                new Student("감자바",88)
        );
        
        int sum1= studentsList.stream()
                .mapToInt(Student::getScore)
                .sum();
        
        int sum2=studentsList.stream()
                .map(Student::getScore)
                .reduce(0,(a,b)->a+b);

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }
}
class Student{
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
