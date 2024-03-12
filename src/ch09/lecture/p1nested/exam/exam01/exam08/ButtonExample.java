package ch09.lecture.p1nested.exam.exam01.exam08;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk=new Button();

        class OkListener implements Button.ClickListener{
            @Override
            public void onClick() {
                System.out.println("ok button click");
            }
        }
        btnOk.setClickListener(new OkListener());

        btnOk.click();

        Button btnCancel=new Button();

        class CancelListner implements Button.ClickListener{
            @Override
            public void onClick() {
                System.out.println("cancel button click");
            }
        }

        btnCancel.setClickListener(new CancelListner());

        btnCancel.click();
    }
}
