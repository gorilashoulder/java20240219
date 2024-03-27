package ch18.lecture.p2inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C03InputStream {
    public static void main(String[] args) {
        String fileName="temp/output9.data";//25bytes
        try(InputStream is=new FileInputStream(fileName)){
            int data1=is.read();//1bytes

            byte[] datas=new byte[10];
            int len1 =is.read(datas); //10bytes 읽고 배열 쓰고 10 return
            int len2 =is.read(datas); //10bytes 읽고 배열 쓰고 10 return
            int len3 =is.read(datas); //3bytes; 읽고 배열 쓰고 4 return
            int len4 =is.read(datas); //읽은 데이터 없고 -1 return

            System.out.println("len1 = " + len1);
            System.out.println("len2 = " + len2);
            System.out.println("len3 = " + len3);
            System.out.println("len4 = " + len4);

        }catch (IOException e){

        }
    }
}
