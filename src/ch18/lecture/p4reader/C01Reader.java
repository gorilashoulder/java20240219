package ch18.lecture.p4reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class C01Reader {
    public static void main(String[] args) throws Exception {
        //inputstream:
        //reader: 문자 단위 입력 스트림

        Reader reader=new FileReader("temp/output2.txt");
        int read1 = reader.read();
        int read2=reader.read();
        int read3=reader.read();
        int read4=reader.read();

        System.out.println(read1);
        System.out.println(read2);
        System.out.println(read3);

        System.out.println((char) read1);
        System.out.println((char) read2);
        System.out.println((char) read3);
        System.out.println("read4 = " + read4);
    }
}
