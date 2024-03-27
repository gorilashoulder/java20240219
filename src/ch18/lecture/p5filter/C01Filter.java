package ch18.lecture.p5filter;

import java.io.*;

public class C01Filter {
    public static void main(String[] args) throws Exception {
        //어떤 I/O stream을
        //다른 I/O stream으로 변경해서 사용할 수 있다.

        String file="temp/output3.txt";
        InputStream is=new FileInputStream(file);
        //InputStreamReader
        //byte stream을 character stream으로 연결
        Reader reader =new InputStreamReader(is);

       // int data1 = is.read();
        int data1=reader.read();
        System.out.println((char)data1);

        is.close();

    }
}
