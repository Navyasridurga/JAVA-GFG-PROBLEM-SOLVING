interface Notification<T>{
    void send(T message);

}
class EmailNotification implements Notification<String >{
    @Override
    public void send(String message){
        System.out.println("mail:"+message);
    }

}
class Main4{
    public static void main(String args[]){
        EmailNotification e1=new EmailNotification();

        e1.send("welcome to java generaics");
    }
}