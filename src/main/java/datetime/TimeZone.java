package datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Set;

public class TimeZone {
    public static void main(String[] args) {
        //timeZone();
        formatting();
    }

    private static void timeZone(){
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);
        ZoneId of = ZoneId.of("Etc/GMT+9");
        System.out.println(of);
        LocalDateTime localDateTime = LocalDateTime.of(2022, Month.MARCH, 16, 16,10,00);
        ZonedDateTime zonedDateTime = localDateTime.atZone(of);
        System.out.println(zonedDateTime);

        Instant instant = zonedDateTime.toInstant();
        ZonedDateTime utc = instant.atZone(ZoneId.of("UTC"));
        System.out.println(utc);

        ZonedDateTime ambiguous = ZonedDateTime.of(
                LocalDate.of(2013,10,27),
                LocalTime.of(2, 30),
                ZoneId.of("Europe/Berlin")
        );

        ZonedDateTime anHourLater = ambiguous.plusHours(1);
        System.out.println("ambiguous: " + ambiguous);
        System.out.println("anHourLater: " + anHourLater);
    }

    private static void formatting(){
        ZonedDateTime appollo11launch = ZonedDateTime.of(
                1969, 7, 16,
                9, 32, 0, 0,
                ZoneId.of("America/New_York"));
        String formatted = DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(appollo11launch);
        System.out.println(formatted);

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        formatted = formatter.format(appollo11launch);
        System.out.println(formatted);

        formatted = formatter.withLocale(Locale.FRENCH).format(appollo11launch);
        System.out.println(formatted);

        formatter = DateTimeFormatter.ofPattern("E yyyy-MM-dd HH:mm");
        formatted = formatter.format(appollo11launch);
        System.out.println(formatted);

        LocalDate churchsBirthday = LocalDate.parse("1903-06-14");
        System.out.println("churchsBirthday: " + churchsBirthday);
        appollo11launch = ZonedDateTime.parse("1967-07-16 03:32:00-0400",
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssxx"));
        System.out.println("apollo11launch: " + appollo11launch);
    }
}
