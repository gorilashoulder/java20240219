package ch19.lecture.p1network;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Computer1 {
    public static void main(String[] args) throws Exception {
        //연결을 기다리는 쪽
        ServerSocket serverSocket = new ServerSocket(9000);
        Socket socket = serverSocket.accept();//연결 요구하기를 기다림


        //socket 생성
        try (socket) {
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            //출력 스트림 데코레이팅....
            PrintWriter pw = new PrintWriter(bw);

            try (os;osw;bw;pw){
            pw.println("hello world");

            }
        }
    }
}
