package ch06.lecture.p2method;

public class c04Parameter {
    public static void main(String[] args) {
        c04Calculator cal =new c04Calculator();
        cal.printsum(5,7);//메소드 호출시 파라미터에 값(매개값, 인수,argument)을 줘야함
        cal.printsum(9,13);
        cal.printsum(322,22);


        cal.printDivide(3.14, 0.5);
        cal.printDivide(9.0, 3);
        cal.printDivide(10, 2);
    }
}

class c04Calculator{
    void printsum(int a, int b){
        int result= a+b;
        System.out.println(result);
    }

    void printDivide(double a, double b){
        double result2= a/b;
        System.out.println(result2);
    }
}
