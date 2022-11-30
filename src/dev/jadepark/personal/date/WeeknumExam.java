package dev.jadepark.personal.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class WeeknumExam {


    public static void main(String[] args) {

    }

    public Integer getWeekNumber (LocalDate date) {
        LocalDate firstMondayOfMonth = date.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

        // 첫 월요일이면 바로 리턴
        if (firstMondayOfMonth.isEqual(date)) return 1;

        if (date.isAfter(firstMondayOfMonth)) {
            // 첫 월요일 이후일 때
            int diffFromFirstMonday = date.getDayOfMonth() - firstMondayOfMonth.getDayOfMonth();
            int weekNumber = (int) Math.ceil(diffFromFirstMonday / 7.0);
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) weekNumber += 1;
            return weekNumber;
        }
        // 첫 월요일 이전이면 회귀식으로 전 달 마지막 주차를 구함
        return getWeekNumber(date.minusMonths(1).with(TemporalAdjusters.lastDayOfMonth()));
    }
}
