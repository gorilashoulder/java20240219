package ch18.lecture.p1outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C09OutputStream {
    public static void main(String[] args) {
        String fileName="temp/output9.data";
        try (OutputStream os = new FileOutputStream(fileName)) {
            os.write(23434); //1bytes use

            byte[] data={10,20,30,40,50,60,70,80,90,100,110};
            os.write(data); //11bytes use
            os.write(data, 0 ,10);
            os.write(data, 5,3); //5번인덱스부터 ~3개

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
