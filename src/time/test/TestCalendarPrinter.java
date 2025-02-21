package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요 : ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요 : ");
        int month = scanner.nextInt();

        printCalendar(year, month);
    }

    public static void printCalendar(int year, int month) {
        LocalDate startDate = LocalDate.of(year, month, 1);
        DayOfWeek startDayOfWeek = startDate.getDayOfWeek();
        LocalDate lastDate = startDate.with(TemporalAdjusters.lastDayOfMonth());
        int lastDay = lastDate.getDayOfMonth();

        printDayHeaders();
        printDays(startDayOfWeek, lastDay);
    }

    // 요일 프레임 출력
    private static void printDayHeaders() {
        System.out.println("Su Mo Tu We Th Fr Sa");
    }

    // 날짜 출력
    private static void printDays(DayOfWeek startDayOfWeek, int lastDay) {
        int startIndex = startDayOfWeek.getValue() % 7;

        // 1. 시작 요일에 따라 공백 추가
        for (int i = 0; i < startIndex; i++) {
            System.out.print("   ");
        }

        // 2. 날짜 출력
        for (int day = 1; day <= lastDay; day++) {
            System.out.printf("%2d ", day);

            if ((startIndex + day) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
