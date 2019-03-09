package com.itheima.demo03.ReverseStream;

import java.io.*;

public class Demo04 {
    public static void main(String[] args) throws IOException {
//        input();
        OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream("nico.txt"),"gbk");
        os.write("1");
        os.write("1");
        os.write("1");
        os.write("1");
        os.write("1");
        os.write("1");
        os.write("nico");
        os.write("nico");
        os.write("nico");
        os.write("nico");
        os.write("nico");
        os.write("nico");
        os.flush();
        os.close();

    }

    private static void input() throws IOException {
        InputStreamReader is = null;
        try {
            is = new InputStreamReader(new FileInputStream("c.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int len =0;
        while ((len = is.read()) != -1) {
            System.out.println((char)len);
        }
        System.out.println(is);
    }
}
