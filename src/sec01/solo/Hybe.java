package sec01.solo;

import java.util.ArrayList;
import java.util.List;

public class Hybe {
    public static void main(String[] args) {
        List<NewJeans> newJeans=new ArrayList<>();
        newJeans.add(new NewJeans("해인",18,170));
        newJeans.add(new NewJeans("민지",20,168));
        newJeans.add(new NewJeans("혜린",19,165));
        newJeans.add(new NewJeans("다녤",19,166));
        newJeans.add(new NewJeans("하니",20,163));

        int totalmember= newJeans.size();
        System.out.println("총 멤버수="+totalmember);

        for(int i=0; i< newJeans.size(); i++){
            NewJeans member=newJeans.get(i);
            System.out.println(member.getName()+"/"+member.getAge()+"/"+member.getHeight());

        }

        System.out.println("--------------그룹탈퇴--------------------");
        newJeans.remove(0);
        newJeans.remove(1);
        newJeans.remove(2);

        for(int i=0; i< newJeans.size(); i++){
            NewJeans member=newJeans.get(i);
            System.out.println(member.getName()+"/"+member.getAge()+"/"+member.getHeight());
        }

    }
}


class NewJeans{
    String name;

    int age;

    int height;

    public NewJeans(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
