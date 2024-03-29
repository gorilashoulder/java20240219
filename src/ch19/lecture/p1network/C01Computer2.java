package ch19.lecture.p1network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class C01Computer2 {
    public static void main(String[] args) throws IOException {
        //연결을 요규 하는 쪽

        //sockert생성
        Socket socket = new Socket("172.30.1.20", 9000);
        try (socket){
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            try (is;isr;br;){
                String data = br.readLine();
                System.out.println("data = " + data);

            }
            //입력 스트림 데코레이팅
        }
    }
}