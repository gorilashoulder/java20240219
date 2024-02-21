package c02.lecture.p02type;

public class c18Scope {
    public static void main(String[] args) {
        //변수 선언된 블럭 {}안에서만 사용 가능
        int a= 3;

        if (true){
            int b=5;
            System.out.println("if 안");
            System.out.println(a);
            System.out.println(b);
        }
        System.out.println("if 밖");
        System.out.println(a);

        int v1=15;
        if(v1>10){
            int v2= v1-10;
        }
//        int v3= v1 +v2 +5;  v2 변수 오류
    }

}
