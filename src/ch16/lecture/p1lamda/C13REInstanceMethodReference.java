package ch16.lecture.p1lamda;

public class C13REInstanceMethodReference {
    public static void main(String[] args) {
        C13OtherClass obj1=new C13OtherClass();
        C13MyI lamda1= (i,j) -> obj1.someMethod(i,j);
        //C13MyI lamda2= (i,j) -> obj1::someMethod;
    }

}

class C13OtherClass{
    void someMethod(int a, int b){
        System.out.println("어떤일을함..중요하지 않음 ...");
    }
}

interface C13MyI{
    void method(int x, int y);
}
