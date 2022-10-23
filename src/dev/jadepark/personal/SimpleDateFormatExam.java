package dev.jadepark.personal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatExam {

    public static void main(String[] args) throws ParseException {

        String ymd = "20220701150000";

        String substringYmd = ymd.substring(0,8);
        System.out.println("substringYmd = " + substringYmd);
        String substringTime = ymd.substring(8);
        System.out.println("substringTime = " + substringTime);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = simpleDateFormat.parse(substringYmd);
        System.out.println("date = " + date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        //days 변수만큼 일수 +
        calendar.add(Calendar.DATE, 21);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMdd");
        String newYmd = simpleDateFormat2.format(calendar.getTime());
        System.out.println("newYmd = " + newYmd);

        String result = newYmd + substringTime;
        System.out.println("result = " + result);
    }
}
