import java.time.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
public class DateTime1{
    public  static void main(String args[]){
        LocalDateTime dt1=LocalDateTime.parse("2018-11-03T12:45:30");
        System.out.println("Original date:"+dt1);
        System.out.println("BASIC_ISO_DATE formate:"+(DateTimeFormatter.BASIC_ISO_DATE).format(dt1));
        System.out.println("ISO_LOCAL_DATE format:"+(DateTimeFormatter.ISO_LOCAL_DATE).format(dt1));
        System.out.println("ISO_DATE_FORMAT:"+DateTimeFormatter.ISO_DATE);
    System.out.println("ISO_LOCALTIME format:"+(DateTimeFormatter.ISO_LOCAL_DATE.format(dt1)));
    DateTimeFormatter.ISO_WEEK_DATE.format(dt1);

    }
}
