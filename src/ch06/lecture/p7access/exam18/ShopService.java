package ch06.lecture.p7access.exam18;

public class ShopService {
    private static ShopService obj=new ShopService();

    private ShopService(){

    }

    public static ShopService getInstance(){
        return obj;
    }
}
