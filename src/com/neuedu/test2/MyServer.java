package com.neuedu.test2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(996);
            // 该方法为阻塞 等待客户端连接
            Socket socket = server.accept();
            System.out.println("主机2已连接");
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String str = br.readLine();

            Socket socket2 = new Socket("localhost",886);
            System.out.println("连接成功");
            Scanner scanner = new Scanner(System.in);
            OutputStream os = socket2.getOutputStream();
            PrintStream ps = new PrintStream(os);

            while (true){
                String str2 = scanner.nextLine();
                ps.println(str2);
                ps.flush();
                System.out.println("主机2说："+str);
                str=br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
