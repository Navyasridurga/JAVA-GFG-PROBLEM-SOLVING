import java.time.LocalDateTime;
public class Gfg{
    public static void main(String args[]){
        LocalDateTime time=LocalDateTime.now();
        System.out.println("time:"+time);
        LocalDateTime time1=time.plusYears(1).plusMonths(8).plusWeeks(5).plusDays(1);
        System.out.println(time1);
        LocalDateTime time2=time1.minusHours(1).minusWeeks(8);

    }
}

