import java.time.*;
public class Problem5{
    public static void main(String[] args) {
        LocalTime time=LocalTime.parse("19:34:50");
        int minute=time.getMinute();
        System.out.println(minute);
        int Second =time.getSecond();
        System.out.println(Second);
        LocalTime value=time.plusHours(8);
        System.out.println(value);
        LocalTime valu=time.plusHours(-10);
        System.out.println(valu);
        LocalTime val=time.plusMinutes(12);
        System.out.println(val);
        LocalTime va=time.plusMinutes(-90);
        System.out.println(va);
        LocalTime sec=time.plusSeconds(134);
        System.out.println(sec);
        LocalTime time1=LocalTime.parse("19:34:50.63");
        System.out.println("before localTime Addition:"+time);
        LocalTime ca=time1.plusHours(9);
        System.out.println(ca);




    }
}
