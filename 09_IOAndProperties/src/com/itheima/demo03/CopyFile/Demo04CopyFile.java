package com.itheima.demo03.CopyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/home/nico/demo.png");
        FileOutputStream fos = new FileOutputStream("demo.png");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }
}
