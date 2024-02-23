package c03.lecture.p1arithemetic;

public class c03overflow {
    public static void main(String[] args) {
        //byte(1), short(2), int(4),long(8)
        //float(4) , double(8)

        //overflow: 산술연산 시 저장공간의 한계를 넘어서 원하지 않는 값을 얻음

        int a= 2_000000000;
        int b= 1_000000000;
        int c= a+b;
        System.out.println(c);

        //overflow를 방지하려면 적절한 data type을 선택해야함
        long d= 2_00000000;
        long e= 1_00000000;
        long f= d+e;
        System.out.println(f);

        byte var1= 125;
        for (int i=0; i<5; i++){
            var1++;
            System.out.println("var1="+var1);
        }

        System.out.println("--------------------");

        byte var2= -125;
        for (int i=0; i<5; i++){
            var2--;
            System.out.println("var2="+var2);


        }
    }
}
