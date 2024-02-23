package ch02.lecture.p02type;

import java.math.BigDecimal;

public class c10dooouble {
    //double(float)은 근사 값으로 저장됨
    public static void main(String[] args) {
        double a=0.1;
        double b=0.2;
        System.out.println(a+b);

//연산시 원하지 않은 결과가 나옴
        double c=a+b;
        System.out.println(c);

// BigDecimal 사용해서 문제 해결
        BigDecimal d =new BigDecimal("0.1");
        BigDecimal e =new BigDecimal("0.2");

        BigDecimal f= d.add(e);

        System.out.println(f);
    }
}
