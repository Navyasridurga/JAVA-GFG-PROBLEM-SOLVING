import java.time.*;

import java.time.format.DateTimeFormatter;
public class Problem4{
    public static void main(String args[]){
        DateTimeFormatter formatter=DateTimeFormatter.ISO_LOCAL_TIME;
        LocalTime lt=LocalTime.parse("10:15:45",formatter);
        System.out.println("LocalTime"+lt);
    }
}