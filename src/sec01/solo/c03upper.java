package sec01.solo;

public class c03upper {
    public static void main(String[] args) {
   LeeHwa<String,Integer> shop=new LeeHwa<>();




    }
}


class LeeHwa <T,V>{

    private T name;

    private T local;
    private T menu;

    private V price;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getLocal() {
        return local;
    }

    public void setLocal(T local) {
        this.local = local;
    }

    public T getMenu() {
        return menu;
    }

    public void setMenu(T menu) {
        this.menu = menu;
    }

    public V getPrice() {
        return price;
    }

    public void setPrice(V price) {
        this.price = price;
    }
}