package algorithmpractice.n1;

public class FibonacciSequence {
    public static void main(String[] args) {
        int [] fibonacci=new int[100];
        fibonacci[0]=1;
        fibonacci[1]=1;

        for (int i = 2; i < 100; i++) {
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
            System.out.println(fibonacci[i]);
        }

    }
}
