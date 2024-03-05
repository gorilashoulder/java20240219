package ch06.lecture.p2method.exam15re;

public class MemberServiceExample {
    public static void main(String[] args) {
        MemberService memberService=new MemberService();
        boolean result=memberService.login("hong","12345");
        if(result){
            System.out.println("로그인완료");
            memberService.logout("hong");
        }else{
            System.out.println("id or password 일치 x");
        }
    }
}
