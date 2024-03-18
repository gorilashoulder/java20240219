package sec01.solo;

public class staticapp {
    public static void main(String[] args) {

        Study study=new Study();
        Study study1=new Study();
        study.a="protein";
        study.b="protein";
        study.method();
        study1.method();
    }
}

class Study{
    public String a="hello";

    public static String b= "dance";

    public void method(){
        System.out.println(a);
        System.out.println(b);
        System.out.println("안녕");
    }
     static void method1(){
         System.out.println(b);
        System.out.println("나도안녕 ");
    }
}
