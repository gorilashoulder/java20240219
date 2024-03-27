package ch18.lecture.p2inputStream.exam.exam03;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) throws Exception {
        String originName="temp/text.jpg";
        String targetName="temp/text2.jpg";

        InputStream is=new FileInputStream(originName);
        OutputStream os=new FileOutputStream(targetName);

        byte[]data=new byte[1024];
        while (true){
            int num=is.read(data);
            if (num==-1){
                break;
            }
            os.write(data,0,num);
        }
        os.flush();
        os.close();
        is.close();
        System.out.println("복사완료");
    }
}