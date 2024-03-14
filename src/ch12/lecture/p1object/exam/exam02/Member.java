package ch12.lecture.p1object.exam.exam02;

public class Member {
    String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target){
            if(id.equals(target.id)){
                return true;
            }
        }
        return false;
    }
}
