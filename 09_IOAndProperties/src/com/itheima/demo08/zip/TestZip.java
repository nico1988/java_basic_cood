package com.itheima.demo08.zip;

public class TestZip
{

    public static void main(String[] args)
    {
        ZipCompress zipCom = new ZipCompress("C:\\Users\\Administrator\\Desktop\\test.zip","C:\\Users\\Administrator\\Desktop\\upload_test");
        try
        {
            zipCom.zip();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}