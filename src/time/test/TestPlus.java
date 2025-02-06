package time.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.of(2024, 01, 01, 00, 00);
        System.out.println("기준 시각 : " + time);

        Period period = Period.of(1, 2, 3);
        Duration duration = Duration.ofHours(4);

        LocalDateTime futureTime = time.plus(period).plus(duration);
        System.out.println("1년 2개월 3일 4시간 후의 시각 : " + futureTime);
    }
}
