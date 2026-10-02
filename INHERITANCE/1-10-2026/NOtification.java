public class NOtification {
    void sendNotification() {
        System.out.println("Sending general notification");

    }

}
class EmailNotification extends NOtification{
    @Override
     void sendNotification(){
        System.out.println("Sending email notification");
        super.sendNotification();
    }
    public static void main (String args[]){
        EmailNotification e1=new EmailNotification();
        e1.sendNotification();

    }

}
