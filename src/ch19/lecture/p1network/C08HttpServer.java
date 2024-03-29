package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class C08HttpServer {
    public static void main(String[] args) throws IOException {
        //응답 메시지 보내기


        ServerSocket serverSocket = new ServerSocket(9000);
        while (true) {


            final Socket socket = serverSocket.accept();

            Runnable runnable = new Runnable() {
                public void run() {
                    try (socket) {
                        OutputStream os = socket.getOutputStream();
                        OutputStreamWriter osw = new OutputStreamWriter(os);
                        BufferedWriter bw = new BufferedWriter(osw);
                        PrintWriter pw = new PrintWriter(bw);

                        SocketAddress client = socket.getRemoteSocketAddress();
                        String clientAddress = client.toString();
                        try (os; osw; bw; pw;) {
                            String body = """
                                    <html>
                                     <head>
                                       <title> 직접 만든 HTML 코드 </title>
                                     </head>
                                     <body>
                                      <h1>처음부터 만드는 server</h>
                                      <p>힘들어서 이렇게 못하겠다</p>
                                      </body>
                                      </html>
                                    """;

                            //첫번째 줄
                            pw.println("HTTP/1.1 200 OK");

                            //두번째 줄 ~
                            pw.println("content-type:text/html; charset=utf-8");
                            pw.println("content-length:" + body.getBytes().length);

                            //한 줄 띄우고
                            pw.println();

                            //본문
                            pw.println(body);

                        }
                    }catch (IOException e){
                        System.out.println(e.getMessage());
                    }
                }
            };
            //본문작성
            Thread thread=new Thread(runnable);
            thread.start();
        }
    }
}
