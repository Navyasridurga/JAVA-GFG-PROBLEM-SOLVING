public class MovieTicket {
    int theater(int  ticket_price,int members){
       int total_ticket_cost=ticket_price*members;
       return total_ticket_cost;

    }

    public static void main(String[] args) {
        MovieTicket m1=new MovieTicket();
        System.out.println(m1.theater(180, 4));


    }
    
}
