package ch09.lecture.excercise.excercise5;

public interface Action {
    public void work();
}
class ActionExample{
    public static void main(String[] args) {
      Action action=new Action() {
          @Override
          public void work() {
              System.out.println("복사를 합니다");
          }
      };
      action.work();
    }
}
