
import java.time.*;
import java.time.temporal.*;
public class Program2 {
    /**
     * @param args
     */
    public static void main(String args[]){
        LocalTime time =LocalTime.now();
        System.out.println("time:"+time);
        LocalTime time2=LocalTime.of(5,6,12,78);
        System.out.println(time2);
    }

}
