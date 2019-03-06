package cn.itcast.day11.SimpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoSimpleDateFormat {
    public static void main(String[] args){
        Date date=new Date();
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyyMMddHHmm");//显示20171027格式
        System.out.println(sdf1.format(date));
        System.out.println("abc".lastIndexOf(".zip"));
        System.out.println(System.currentTimeMillis());
    }
}
