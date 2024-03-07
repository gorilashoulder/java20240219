package ch06.lecture.p7access;

public class c04GetterSetter {
}

class c04myclass{
    private  String name;

    private int age;

    private boolean married; // get->is

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

}
