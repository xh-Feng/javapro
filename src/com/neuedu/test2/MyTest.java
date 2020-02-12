package com.neuedu.test2;

import java.io.*;

public class MyTest {
    //把d下 某个文件 复制到  d:/a 下
    public static void main(String[] args) {
        File file = new File("d:\\a");
        File input = new File("d:\\HBuilder\\HBuilderX.2.0.1.20190614\\HBuilderX\\readme\\123\\OnePiece\\1.jpg");
        if (!file.exists()){
            file.mkdirs();
        }
        File out = new File("d:\\a\\"+input.getName());
        InputStream inputStream = null;
        OutputStream outputStream = null;
        byte[] b = new byte[1024];
        try {
            inputStream =new FileInputStream(input);
            outputStream = new FileOutputStream(out,true);
            int len = inputStream.read(b);
            while (len != -1){
                outputStream.write(b,0,len);
                outputStream.flush();
                len = inputStream.read(b);
            }
            System.out.println("复制完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream!=null)
                    outputStream.close();
                if (inputStream!=null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
