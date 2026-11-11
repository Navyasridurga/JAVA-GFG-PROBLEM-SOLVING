import java.time.*;

public class Problem6 {
    public static void main(String args[]){
        
        Duration duration=Duration.ofMinutes(10);

        System.out.println("Minutes:"+duration.toMinutes());
        System.out.println("Seconds:"+duration.getSeconds());
        System.out.println("hours:"+duration.toHours());
        System.out.println("duration hours:"+duration.plusHours(2));
        System.out.println("Minus:"+duration.minusMinutes(7));

    }
    
}
