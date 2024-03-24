package ch17.lecture.p1stream.excercise.n7;

import javax.xml.namespace.QName;

public class Member {
    String name;
    String job;

    public Member(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}
