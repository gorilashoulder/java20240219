package ch14.lecture.p1thread.exam.exam03;

public class SumThread extends Thread{
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            sum+=i;

        }
    }
}
