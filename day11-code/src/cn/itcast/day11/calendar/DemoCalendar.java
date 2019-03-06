package cn.itcast.day11.calendar;

import java.util.Calendar;

public class DemoCalendar {
    public static void main(String[] args){
        int y,m,d,h,mi,s;
        Calendar cal=Calendar.getInstance();
        y=cal.get(Calendar.YEAR);
        m=cal.get(Calendar.MONTH);
        d=cal.get(Calendar.DATE);
        h=cal.get(Calendar.HOUR_OF_DAY);
        mi=cal.get(Calendar.MINUTE);
        s=cal.get(Calendar.SECOND);
        System.out.println(y+"-"+m+"-"+d+"-"+h+"-"+h+"-"+mi+"-"+s);
    }
}
