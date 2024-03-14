package ch16.lecture.p1lamda.exam.exam05;

public class Person {
    public Member getMember1(Creatable1 creatable){
        String id="winter";
        Member member=creatable.create(id);
        return member;
    }

    public Member gerMember2(Creatable2 creatable){
        String id="winter";
        String name="한겨울";
        Member member=creatable.create(id,name);
        return member;
    }
}

class ConstructorReferenceExample{
    public static void main(String[] args) {
        Person person=new Person();


        Member m1=person.getMember1(Member::new);
        System.out.println(m1);
        System.out.println();

        Member m2=person.gerMember2(Member::new);
        System.out.println(m2);
    }
}
