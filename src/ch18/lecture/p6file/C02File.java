package ch18.lecture.p6file;

import java.io.File;
import java.io.IOException;

public class C02File {
    public static void main(String[] args) throws IOException {
        String path="temp/output99.txt";
        File file=new File(path);

        System.out.println("fille.exists() = " + file.exists());

        if(!file.exists()){
            file.createNewFile();
        }

        System.out.println(file.exists());
    }
}
