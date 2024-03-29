package ch18.lecture.p4reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class C03Reader {
    public static void main(String[] args) throws IOException {
        String file="temp/output3.txt";
        Reader reader=new FileReader(file);
        char[]data=new char[5];

        reader.read(data);//5
        System.out.println("Arrays.toString(data) = " + Arrays.toString(data));
        reader.read(data);//5
        System.out.println("Arrays.toString(data) = " + Arrays.toString(data));
        reader.read(data);
        System.out.println("Arrays.toString(data) = " + Arrays.toString(data));
        reader.read(data);
        System.out.println("Arrays.toString(data) = " + Arrays.toString(data));
        reader.read(data);
        System.out.println("Arrays.toString(data) = " + Arrays.toString(data));
        reader.read(data);
        System.out.println("Arrays.toString(data) = " + Arrays.toString(data));

        reader.close();
    }
}
