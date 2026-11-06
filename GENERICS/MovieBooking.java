interface Booking<T>{
    void book(T ticketId);
}
class MovieBooking implements Booking<Integer>{
    @Override
    public void book(Integer ticketId){
        System.out.println("Movie ticketId:"+ ticketId);

    }
}
class ConcertBooking implements Booking<String>{
    @Override
    public void book(String ticketId){
        System.out.println("Concert ticketId:"+ticketId);
    }
}
    class Main7{
        public static void main(String args[]){
            MovieBooking m1=new MovieBooking();
            m1.book(123);
            ConcertBooking c1=new ConcertBooking();
            c1.book("CONCERT101");
        }
    }
