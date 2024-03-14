package ch12.lecture.p1object.exam.exam03;

import java.util.Objects;

public class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }


    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int haseCode=no+name.hashCode();
        return haseCode;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj instanceof Student target){
           if(no== target.getNo()&& name.equals(target.getName())){
               return true;
           }
       }
       return false;
    }
}
