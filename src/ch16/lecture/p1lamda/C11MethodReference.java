package ch16.lecture.p1lamda;

public class C11MethodReference{
    public static void main(String[] args) {
        C11MyInterface obj1 = (param1, param2) -> staticMethod(param1, param2);
        C11MyInterface obj2 = C11MethodReference::staticMethod;
    }

    static void staticMethod(String x, int y) {
        System.out.println(x + y);
    }
}

@FunctionalInterface
interface C11MyInterface {
    void method(String a, int b);
}

