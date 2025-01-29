import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class TimeZones {
    public static void main(String[] args) {
        ZonedDateTime nowGMT = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime nowIST = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime nowPST = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Current time in GMT: " + nowGMT.format(formatter));
        System.out.println("Current time in IST: " + nowIST.format(formatter));
        System.out.println("Current time in PST: " + nowPST.format(formatter));
    }
}
