package ch05.lecture.p2string;

public class c08Indexof {
    public static void main(String[] args) {
        String s1= "java, spring, css, spring, java";
        String s2="va";
        int i1=s1.indexOf(s2);
        int i2=s1.indexOf("ring");
        int i3=s1.indexOf("html");

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
}
