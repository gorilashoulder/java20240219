package algorithmpractice.n2;

import java.util.Scanner;

public class Mode {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int [] inputNum =new int [10];
        for (int i = 0; i < 10; i++) {
            inputNum[i] =scanner.nextInt();
        }

        int [] mode = new int[10];
        for (int i = 0; i < 10; i++) {
            mode[inputNum[i]]++;
        }

        int modenum =0;
        int modecCnt=0;
        for (int i = 0; i < 10; i++) {
            if (modecCnt<mode[i]){
                modecCnt=mode[i];
                modenum=i;
            }
        }
        System.out.println("최빈수="+modenum+","+"최빈수 나온횟수"+modecCnt);
    }
}
