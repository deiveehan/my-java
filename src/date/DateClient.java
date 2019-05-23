package date;

import java.time.*;

public class DateClient {
    public static void main(String[] args) {
        LocalDate localDate =  LocalDate.now();
        LocalTime localTime = LocalTime.of(12, 20);
        LocalDateTime localDateTime = LocalDateTime.now();
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));

        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("zonedDateTime = " + zonedDateTime);
        System.out.println("offsetDateTime = " + offsetDateTime);

    }
}
