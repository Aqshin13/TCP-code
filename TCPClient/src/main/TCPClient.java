package main;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {

    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("localhost", 1313);
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        File file = new File("C://Users//User//Desktop//sekil.jpg");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bs = new byte[(int) file.length()];
        fileInputStream.read(bs);
        dataOutputStream.write(bs);
        socket.close();

    }
}
