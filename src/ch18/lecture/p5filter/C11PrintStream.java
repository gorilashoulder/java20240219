package ch18.lecture.p5filter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class C11PrintStream {
    public static void main(String[] args) throws IOException {
        String file="temp/output11.txt";
        FileOutputStream fos=new FileOutputStream(file);
        PrintStream ps=new PrintStream(fos);

        ps.print("hello world");
        ps.print("");
        ps.println("곧점심이다");
        ps.println("배고파요");
        ps.printf("");
        ps.close();

    }
}
