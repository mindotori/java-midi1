package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
//날짜와 시간을 조회하려면 날짜와 시간 항목 중에 어떤 필드를 조회할 지 선택해야 한다.
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        // get() = 어떤 필드를 조회할 것인지 => ChronoField 열거형 꺼내쓰기
        System.out.println("YEAR = " + dt.get(ChronoField.YEAR));
        System.out.println("MONTH_OF_YEAR = " + dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("DAY_OF_MONTH = " + dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("HOUR_OF_DAY = " + dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("MINUTE_OF_HOUR = " + dt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("SECOND_OF_HOUR = " + dt.get(ChronoField.SECOND_OF_MINUTE));

        System.out.println("-----편의 메서드 제공-----");
        System.out.println("YEAR = " + dt.getYear());
        System.out.println("MONTH_OF_YEAR = " + dt.getMonthValue());
        System.out.println("DAY_OF_MONTH = " + dt.getDayOfMonth());
        System.out.println("HOUR_OF_DAY = " + dt.getHour());
        System.out.println("MINUTE_OF_HOUR = " + dt.getMinute());
        System.out.println("SECOND_OF_HOUR = " + dt.getSecond());

        System.out.println("-----편의 메서드에 없음-----");
        System.out.println("MINUTE_OF_DAY = " + dt.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("SECOND_OF_DAY = " + dt.get(ChronoField.SECOND_OF_DAY));
    }
}
