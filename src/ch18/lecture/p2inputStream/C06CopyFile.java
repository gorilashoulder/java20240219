package ch18.lecture.p2inputStream;

import java.io.*;

public class C06CopyFile {
    public static void main(String[] args) {
        String inputFilename="temp/dog.png";
        String outputFilename="temp/dog-copy.png";

        try {
            InputStream is=new FileInputStream(inputFilename);
            OutputStream os=new FileOutputStream(outputFilename);

            try (is;os;){
             byte[] data=new byte[1024];
             int len=0;

             while ((len=is.read(data))!=-1){
                 os.write(data,0,len);
             }
             os.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
