package ch16.lecture.p1lamda.exam.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        Button btn=new Button();

        btn.setClickListener(()->{
            System.out.println("ok button click");
        });

        btn.click();

        Button btnC=new Button();

        btnC.setClickListener(()->{
            System.out.println("cancel button click");
        });

        btnC.click();
    }
}
