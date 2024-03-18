package sec01.solo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Chan {
   public static void main(String[] args) {
//      printFour();
//      getSoccerWord();
      getD();
   }

   public static void printFour() {
      List<Integer> list=new ArrayList<>();
      Random random = new Random();

      boolean run=true;
      while(run){
         int computer = random.nextInt(1,100);
         System.out.println(computer);
         if (computer == 20) {
            System.out.println("여기다!" + computer);
            break;
         } else {
            System.out.println(computer);
         }
      }

   }

   public static void getSoccerWord() {
      List<String> list = new ArrayList<>();
      List<String> list2 = new ArrayList<>();

      list.add("S");
      list.add("D");
      list.add("C");
      list.add("O");
      list.add("R");

      list2.add("A");
      list2.add("B");
      list2.add("C");
      list2.add("D");
      list2.add("E");

      for (int i=0; i < list.size(); i++) {
         for (int j=0; j < list2.size(); j++) {
            String target = list.get(i);
            String target2= list2.get(j);

            if(target.equals(target2)){
               System.out.println(target + "와"+ target2 + "가같습니다");
            }
         }
      }
   }

   public static void getD() {
      String a = "dddddDDDDddddDDDDAAAAAFFDDDSDSF";
      String [] b= a.split("");
      int sum=0;
      int sum2=0;
      for (int i=0; i< b.length; i++){
         if (b[i].equals("d")){
            sum++;
         }

         if (b[i].equals("D")){
            sum2++;
         }
      }
      System.out.println("d의 개수는 "+ sum);
      System.out.println("D의 개수는 "+ sum2);
   }
}


