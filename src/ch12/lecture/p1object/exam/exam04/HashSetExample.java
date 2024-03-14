package ch12.lecture.p1object.exam.exam04;

import ch12.lecture.p1object.exam.exam03.Student;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();

        Student s1=new Student(1,"홍길동");
        hashSet.add(s1);
        System.out.println("저장된 객체수:"+hashSet.size());

        Student s2=new Student(1,"홍 길동");
        hashSet.add(s2);
        System.out.println("저장된 객체수:"+hashSet.size());

        Student s3=new Student(2,"홍길동");
        hashSet.add(s3);
        System.out.println("저장된 객체수:"+hashSet.size());
    }
}
