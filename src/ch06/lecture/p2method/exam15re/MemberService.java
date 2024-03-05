package ch06.lecture.p2method.exam15re;

public class MemberService {
    boolean login(String id,String password){
       boolean ishong=id.equals("hong");
       boolean ispassword=id.equals("hong");
       return true;
    }

    void logout(String id){
        System.out.println(id+"로그아웃 되었습니다");
    }
}
