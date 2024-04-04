package ch12.lecture.p4reflection;

public class C01Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<MyCalss1> class1 = MyCalss1.class;
        Class<?> class2 = Class.forName("ch12.lecture.p4reflection.MyCalss1");
        System.out.println(class1==class2); //true

        MyCalss1 obj=new MyCalss1();
        Class<? extends MyCalss1> class3=obj.getClass();
    }
}

class MyCalss1{
    private String name;
    private Integer age;

    public MyCalss1(){
        this.name=name;
        this.age=age;
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

    public void myMethod1(String param1, Double param2){

    }
}
