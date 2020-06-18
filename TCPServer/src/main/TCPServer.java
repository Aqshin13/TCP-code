package main;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(1313);
        while (true) {
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            int a = 0;
            FileOutputStream fileOutputStream = new FileOutputStream("C://Users//User//Desktop//sekil2.jpg");
            while ((a = inputStream.read()) != -1) {
                fileOutputStream.write(a);
            }
        }
    }
}
