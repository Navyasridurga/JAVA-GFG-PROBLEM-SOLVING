class MovieTicket{
    String movieName;
    int seatNumber;
    int ticketPrice;
    MovieTicket(String movieName,int seatNumber,int ticketPrice){
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.ticketPrice=ticketPrice;
    }
    public static void main(String args[]){
        MovieTicket m1=new MovieTicket("bahubali",23,450);
        MovieTicket m2=new MovieTicket("paradise",45,230);
        System.out.println(m1.movieName+" "+m1.seatNumber+" "+m1.ticketPrice);
        System.out.println(m2.movieName+" "+m2.seatNumber+" "+m2.ticketPrice);
    }
}