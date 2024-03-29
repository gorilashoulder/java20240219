package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C04Computer1 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8900);
        while (true) {
            Socket socket = serverSocket.accept();

            Thread t=new Thread(()->{
                try (socket) {
                    OutputStream os = socket.getOutputStream();
                    BufferedOutputStream bos = new BufferedOutputStream(os);


                    FileInputStream fis = new FileInputStream("temp/dog2.png");
                    BufferedInputStream bis = new BufferedInputStream(fis);

                    try (os; bos; fis; bis;) {
                        byte[] data = new byte[1024];
                        int len;
                        while ((len = bis.read(data)) != -1) {
                            bos.write(data, 0, len);
                        }
                        bos.flush();
                    }catch (Exception e){
                        System.err.println("오류"+socket.getRemoteSocketAddress());

                    }
                    System.err.println("완료"+socket.getRemoteSocketAddress());
                }catch (Exception e){
                    System.err.println("오류"+socket.getRemoteSocketAddress());
                }

            });
            t.start();



        }
    }
}
