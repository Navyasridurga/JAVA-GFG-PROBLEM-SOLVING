package ObjectMethods;

public class Movie {
    String movieName;
    int ticketPrice;
    int screenNumber;

    Movie(String movieName, int ticketPrice, int screenNumber) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.screenNumber = screenNumber;
    }

    @Override 
    public String toString(){
        return movieName+" "+ticketPrice+" "+screenNumber; 
   }

   public static void main(String args[]){
    Movie m1=new Movie("og",150,1);
        System.out.println(m1);

    System.out.println(m1.toString());

   }

}

