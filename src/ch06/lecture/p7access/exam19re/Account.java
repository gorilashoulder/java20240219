package ch06.lecture.p7access.exam19re;

public class Account {
    private static final int MIN_BALANCE =0;
    private static final int MAX_BALANCE = 1000000;
    private int balance;



    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance>MIN_BALANCE && balance <= MAX_BALANCE){
            this.balance = balance;
        }else{
            System.out.println("범위 초과입니다.");
        }

    }
}
