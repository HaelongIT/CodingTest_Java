package time.test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        ZonedDateTime seoulTime = ZonedDateTime.of(2024, 1, 1, 9, 0, 0, 0, seoulZoneId);
        System.out.println("서울의 회의 시간 : " + seoulTime);

        ZoneId londonZoneId = ZoneId.of("Europe/London");
        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(londonZoneId);
        System.out.println("런던의 회의 시간 : " + londonTime);

        ZoneId newyorkZoneId = ZoneId.of("America/New_York");
        ZonedDateTime newyorkTime = londonTime.withZoneSameInstant(newyorkZoneId);
        System.out.println("뉴욕의 회의 시간 : " + newyorkTime);
    }
}
