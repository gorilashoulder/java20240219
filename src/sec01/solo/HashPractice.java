package sec01.solo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashPractice {
    public static void main(String[] args) {

        Set<Info> infos = new HashSet<>();
        Info info1=new Info("심성환",20);
        Info info2=new Info("박재훈",29);
        Info info3=new Info("서다봄",27);
        Info info4=new Info("심성환",20);

        infos.add(info1);
        infos.add(info2);
        infos.add(info3);
        infos.add(info4);
        for(Info info:infos){
            System.out.println(info);
        }

    }
}

class Info{
    String name;
    Integer age;

    public Info(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Info info = (Info) o;
        return Objects.equals(name, info.name) && Objects.equals(age, info.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
