package net.jinocryst.personal.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class ValidationDate {
    public static void main(String[] args) throws ParseException {
        LocalDate localDate = LocalDate.now();


        String ymd = "20211103";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

        // 로컬 컴퓨터의 현재 날짜 정보를 저장한 LocalDate 객체를 리턴
        Date today = simpleDateFormat.parse(localDate.toString());
        System.out.println("today="+today);

        Date targetYmd = simpleDateFormat.parse(ymd);
        System.out.println("targetYmd="+targetYmd);

        /*
        localYmd가 이전이면 -1
        같으면 0
        localYmd가 이후면 1
         */
        int compare = today.compareTo(targetYmd);
        System.out.println("compare="+compare);

        //0보다 크면 targetYmd는 미래

        System.out.println(compare < 0);
    }
}
