package com.itheima.demo03.ReverseStream;

import java.io.*;

public class Demo05 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("g.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("aaaa.txt"));
        int len;
        char[] chars = new char[1024];
        while((len = isr.read(chars))!=-1){
            osw.write(chars,0,len);
        }
        osw.close();
        isr.close();
    }
}
