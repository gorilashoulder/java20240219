package ch13.lecture.p1generic;

public class C03GenericType {
    public static void main(String[] args) {
        C03Box<String, Integer> box1 = new C03Box<>();
        var box2 = new C03Box<Double, String>();

        box1.setItem1("java");
        String item1=box1.getItem1();
        box1.setItem2(300);
        Integer item2=box1.getItem2();

        box2.setItem1(3.14);
        Double item3=box2.getItem1();
        box2.setItem2("spring");
        String item4=box2.getItem2();
    }
}
class C03Box<T,V>{
    private T item1;
    private V item2;

    public T getItem1() {
        return item1;
    }

    public V getItem2() {
        return item2;
    }

    public void setItem2(V item2) {
        this.item2 = item2;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }
}