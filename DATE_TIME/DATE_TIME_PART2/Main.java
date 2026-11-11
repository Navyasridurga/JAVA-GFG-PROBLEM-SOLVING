import java.time.*;
import java.time.format.*;
public class Main{
    public static void main(String args[]){
        DateTimeFormatter formatter=DateTimeFormatter.ISO_LOCAL_TIME;
        LocalTime lt=LocalTime.parse("10:15:45",formatter);
        System.out.println("LocalTime"+lt);
        LocalTime time=LocalTime.parse("23:5:12");
        int hour=time.getHour();
        System.out.println(hour);
        int minute=time.getMinute();
        System.out.println(minute);


    }
}