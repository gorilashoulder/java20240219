package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C03Computer1 {
    public static void main(String[] args) throws IOException {
        //ServerSocket 만들기
        ServerSocket serverSocket=new ServerSocket(8900);
        Socket socket= serverSocket.accept();
        //연결기다린 후

        //연결되면 Socket만들기
        try(socket){
            OutputStream os=socket.getOutputStream();
            BufferedOutputStream bos=new BufferedOutputStream(os);


            FileInputStream fis=new FileInputStream("temp/dog2.png");
            BufferedInputStream bis=new BufferedInputStream(fis);

            try (os;bos;fis;bis;){
                byte[] data = new byte[1024];
                int len;
                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
            }
        }


        //Socket에서 OutputStream꺼내기
        //bufferedoutputStream 연결

        //파일 아무거나 temp/dog.png
        //fileinputStream  만들기
        //bufferedInputStream  연결

        //bufferinputStream 읽은데이터
        //bfiOutSTream  으로 출력
    }
}
