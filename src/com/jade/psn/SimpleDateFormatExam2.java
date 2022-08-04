package com.jade.psn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class SimpleDateFormatExam2 {

    public static void main(String[] args) throws ParseException {

        String ymd = "20220701150000";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
        TimeZone tz = TimeZone.getTimeZone("UTC");
        simpleDateFormat.setTimeZone(tz);
        Date date = simpleDateFormat.parse(ymd);
        System.out.println("date = " + date);

        String newDate = String.valueOf(date);
        System.out.println("newDate = " + newDate);

        String getTime = String.valueOf(date.getTime());

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hhmmss aa");

        Date date1 = simpleDateFormat2.parse(getTime);
        System.out.println("date1 = " + date1);

    }
}

