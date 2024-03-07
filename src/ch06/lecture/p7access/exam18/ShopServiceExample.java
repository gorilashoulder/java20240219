package ch06.lecture.p7access.exam18;

public class ShopServiceExample {
    public static void main(String[] args) {
        ShopService obj1=ShopService.getInstance();
        ShopService obj2=ShopService.getInstance();

        if(obj2==obj1){
            System.out.println("객체같다");
        }else {
            System.out.println("객체다르다");
        }
    }
}
