package c02.lecture.p02type;

public class c07character {
    public static void main(String[] args) {
        //char
        //2byte= 16bits
        //0~6535
        //unicode

        char a= 99;
        char b=120;
        char c= 65535;
       // char d= 65536;
       // char e= -1; 음수라 x
        System.out.println("a="+a);
        System.out.println(b);
        System.out.println(c);

        int o= 0x1f3be;
        char[] emoji1= Character.toChars(o);
        String emojis=new String(emoji1);
        System.out.println("emojis-"+emojis);

        char c1='A';
        char c2= 65;

        char c3='가';
        char c4= 44032;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }




}
