package ch12.lecture.p3regex;

public class C03PreDefinedClass {
    public static void main(String[] args) {
        //[0-9] : \d
        //whitespace: \s
        //wordchracter: [a-ZA-Z_0-9] :\w
        //모든문자: .

        String p1="\\d";
        System.out.println("0".matches(p1)); //true
        System.out.println("01".matches(p1)); //false
        System.out.println("a".matches(p1)); //false

        System.out.println("---------------------");

        System.out.println(" ".matches("\\s")); //true
        System.out.println("\t".matches("\\s")); //true
        System.out.println("\n".matches("\\s")); //true

        //연습
        String str="손 흥민";
        String s=str.replaceAll("\\s","");
        System.out.println(s);


        System.out.println("ssss---------------------");

        //wordChatacter
        System.out.println("s".matches("\\w")); //true
        System.out.println("9".matches("\\w")); //true
        System.out.println("D".matches("\\w")); //true
        System.out.println("_".matches("\\w")); //true
        System.out.println("ad".matches("\\w")); //false
        System.out.println("".matches("\\w")); //flase
        System.out.println("$".matches("\\w")); //flase

        System.out.println("---------------------");

        //모든문자 : . (문자하나);
        System.out.println("a".matches(".")); //true
        System.out.println("b".matches(".")); //true
        System.out.println("3".matches(".")); //true
        System.out.println("$".matches(".")); //true
        System.out.println("".matches(".")); //flase
        System.out.println("abb".matches(".")); //flase




    }
}
