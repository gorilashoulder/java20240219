package ch04.lecture.p1if;

public class c04Random {
    public static void main(String[] args) {
        double random1 = Math.random();//0.0<= 리턴값 < 1.0
        System.out.println(random1);

        double value1= random1 * 6; // 0.0<=값 < 6.0
        System.out.println(value1);

        double value2=value1+1; //1.0<=값 < 7.0
        System.out.println(value2);

        int value3 = (int) value2;
        System.out.println(value3);

        int dice1 = (int) ((Math.random()*6)+1);
        System.out.println(dice1);

        if(dice1==1){
            System.out.println("1입니당");
        }
        else if (dice1==2){
            System.out.println("2입니당");
        }
        else if (dice1==3){
            System.out.println("3입니당");
        }
        else if (dice1==4){
            System.out.println("4입니당");
        }
        else if (dice1==5){
            System.out.println("5입니당");
        }
        else {
            System.out.println("6입니당");
        }


    }
}
