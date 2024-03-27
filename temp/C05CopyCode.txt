package ch18.lecture.p4reader;

import java.io.*;

public class C05CopyCode {
    public static void main(String[] args) {
        //C05CopyCode.java 파일을
        //temp/C05CopyCode.txt 파일로 복사

        //Reader,Writer 활용

        String src="src/ch18/lecture/p4reader/C05CopyCode.java";
        String des="temp/C05CopyCode.txt";

        try (Reader reader = new FileReader(src);
             Writer writer = new FileWriter(des)) {

            char[] chars = new char[1024];
            int length;
            while ((length = reader.read(chars)) > 0) {
                writer.write(chars, 0, length);
            }
            System.out.println("File copied successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        }
    }

