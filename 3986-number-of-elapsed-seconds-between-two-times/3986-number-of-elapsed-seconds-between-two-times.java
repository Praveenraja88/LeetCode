import java.time.LocalTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {

        DateTimeFormatter form = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime st = LocalTime.parse(startTime,form);
        LocalTime et = LocalTime.parse(endTime,form);

        Duration dur = Duration.between(st,et);

        return (int) dur.toSeconds();
        
    }
}