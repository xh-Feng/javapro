package com.neuedu.test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {
    public static void main(String[] args) {
        try {
            Socket socket2 = new Socket("localhost",996);
            System.out.println("连接成功");
            Scanner scanner = new Scanner(System.in);
            OutputStream os = socket2.getOutputStream();
            PrintStream ps = new PrintStream(os);

            /*ServerSocket server = new ServerSocket(886);
            Socket socket = server.accept();
            System.out.println("主机1已连接")
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String str = br.readLine();*/

            while (true){
                String str2 = scanner.nextLine();
                ps.println(str2);
                ps.flush();
                /*System.out.println("主机1说："+str);
                str=br.readLine();*/
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
