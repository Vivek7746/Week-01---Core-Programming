import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

class TimeZone{
    
    public static void main(String[] args){
        
        // Getting GMT time
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));

        // Getting IST time
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // Getting PST time
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // Formating
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss z");

        // Displaying the times of all zones
        System.out.println("GMT time : " + gmtTime.format(formatter));
        System.out.println("IST time : " + istTime.format(formatter));
        System.out.println("PST time : " + pstTime.format(formatter));
    }
}