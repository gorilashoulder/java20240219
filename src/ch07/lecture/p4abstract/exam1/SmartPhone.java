package ch07.lecture.p4abstract.exam1;

public class SmartPhone extends Phone{
    SmartPhone(String owner){
        super(owner);
    }

    void internetSerch(){
        System.out.println("인터넷 검색");
    }
}
