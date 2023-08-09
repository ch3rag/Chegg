import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class TimeProblems {
    // Return The Number Of Friday 13th Between Two Dates
    public static int countFridayThirteens(LocalDate start, LocalDate end) {
        // Number Of Fridays
        int numFridays = 0;

        // First We Are Going To Adjust The Start Date To 13
        // Diff Between Start Day Of Month And 13
        int diff =  13 - start.getDayOfMonth();
        if (diff > 0) {
            // Start Day Of Month < 13
            // Add The Difference To Start Date
            start = start.plusDays(diff);
        } else if(diff < 0) {
            // Start Day Of Month > 13
            // Add The Difference To Start Date
            start = start.plusDays(diff);
            // Also Advance The Month By One
            start = start.plusMonths(1);
        }

        // Start Date <= End Date
        while (!start.isAfter(end)) {
            // Check If Current Day Of Week Is Friday
            if (start.getDayOfWeek() == DayOfWeek.FRIDAY) {
                // If Yes, Increment Number Of Fridays
                numFridays++;
            }
            // Add One To The Month
            start = start.plusMonths(1);
        }
        // Return Number Of Fridays
        return numFridays;
    }

    // Returns What Day Of The Week Is, If We Add A Specific Number Of Seconds
    // To A Date Time
    public static String dayAfterSeconds(LocalDateTime timeHere, long seconds) {
        // Add Seconds To Time
        timeHere = timeHere.plusSeconds(seconds);
        // Return String Value Of Day Of The Week
        return timeHere.getDayOfWeek().toString();
    }

    // Coverts A Time From One TimeZone To Another
    // Returns The Current Hour Of The Converted Time
    public static int whatHourIsItThere(LocalDateTime timeHere, String here, String there) {
        return timeHere
                // Get ZonedDateTime Of Time Here
                .atZone(ZoneId.of(here))
                // Convert It To TimeZone There
                .withZoneSameInstant(ZoneId.of(there))
                // Return The Hour There
                .getHour();
    }
}
