package com.neuedu.test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class WebTest {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(9999);
            Socket socket = ss.accept();
            InputStream inputStream=socket.getInputStream();
            byte[] b = new byte[1024];
            int a = inputStream.read(b);
            String str = new String(b,0,a);
            System.out.println(str);
            OutputStream outputStream = socket.getOutputStream();
            StringBuilder builder = new StringBuilder();
            builder.append("HTTP/1.1 200 OK\n");
            builder.append("Content-type: text/html\n");
            builder.append("\r\n");
            builder.append("<html>");
            builder.append("<head><style>.abc{width:200px;height:200px;background:#ff0000}</style></head>");
            builder.append("<body><div class='abc'></div></body>");
            builder.append("</html>");
            outputStream.write(builder.toString().getBytes());
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
