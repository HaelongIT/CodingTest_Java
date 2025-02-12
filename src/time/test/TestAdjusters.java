package time.test;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        // 코드 작성
        LocalDate firstDay = LocalDate.of(year, month, 1);
        LocalDate lastDay = firstDay.withDayOfMonth(firstDay.lengthOfMonth());

        String firstDayOfWeek = firstDay.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        String lastDayOfWeek = lastDay.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        System.out.println("firstDayOfWeek = " + firstDayOfWeek);
        System.out.println("lastDayOfWeek = " + lastDayOfWeek);
    }
}
