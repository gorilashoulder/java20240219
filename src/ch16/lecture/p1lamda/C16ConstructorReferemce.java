package ch16.lecture.p1lamda;

public class C16ConstructorReferemce {
    public static void main(String[] args) {
        C16Myc obj=chars -> new String(chars);
        C16Myc obj2=String::new;
    }
}
interface C16Myc{
    String method(char[] chars);
}
