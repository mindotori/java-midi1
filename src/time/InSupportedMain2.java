package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class InSupportedMain2 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println("supported = " + supported);
        if(supported){ //만약 지원을 하면 실행하라는 코드
            int minute = now.get(ChronoField.SECOND_OF_MINUTE);
            System.out.println("minute = " + minute);
        }

    }
}
