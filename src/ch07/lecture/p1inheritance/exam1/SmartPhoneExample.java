package ch07.lecture.p1inheritance.exam1;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone=new SmartPhone("갤럭시","은색");

        System.out.println("모델="+myPhone.model);
        System.out.println("색깔="+myPhone.color);

        System.out.println("wifi 상태=" +myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("저는 자바입니다");
        myPhone.sendVoice("반갑노");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
