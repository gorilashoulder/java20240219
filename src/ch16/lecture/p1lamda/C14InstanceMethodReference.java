package ch16.lecture.p1lamda;

public class C14InstanceMethodReference {
    public static void main(String[] args) {
        C14OtherC obj=new C14OtherC();
        C14MyI lam1=(a,b)->a.somemethod(b);
        C14MyI lam2=C14OtherC::somemethod;
    }
}

class C14OtherC{
    void somemethod(int x){
        System.out.println("어떤일을 함 ....중요하지 않음...");
    }
}

interface C14MyI{
    void method(C14OtherC obj,int x);
}