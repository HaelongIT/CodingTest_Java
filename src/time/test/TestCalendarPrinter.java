package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요 : ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요 : ");
        int month = scanner.nextInt();

        // 해당 년도와 월에 해당되는 첫 날을 가져와서 일만 떼어오기 + 첫날의 요일 가져오기
        LocalDate startDate = LocalDate.of(year, month, 1);
        DayOfWeek startDayOfWeek = startDate.getDayOfWeek();

        // 마지막 날짜 가져오기
        LocalDate lastDate = startDate.with(TemporalAdjusters.lastDayOfMonth());
        int lastDay = lastDate.getDayOfMonth();

        // 요일 프레임 출력
        System.out.println("Su Mo Tu We Th Fr Sa");

        // 시작 날짜랑 요일과 붙이기 + 토요일에서 끊어주고 다시 일요일로 넘어가기
        // 1. 시작 요일에 따라 공백 추가
        int startIndex = startDayOfWeek.getValue() % 7;
        for (int i = 0; i < startIndex; i++) {
            System.out.print("   ");
        }

        // 2. 날짜 출력 (1부터 lastDay까지)
        for (int day = 1; day <= lastDay; day++) {
            System.out.printf("%2d ", day);

            if ((startIndex + day) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
