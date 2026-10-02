public class Movie {
    String movieName;
    int ticketPrice;

    Movie(String movieName, int ticketPrice) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
    }

    void showMovieDetails() {
        System.out.println(movieName);
        System.out.println(ticketPrice);

    }


}
class PremiumMovie extends Movie{
    String screenType;
    PremiumMovie(String movieName,int ticketPrice,String  screenType){
        super(movieName,ticketPrice);
        this.screenType=screenType;

    }
        
        void showPremiumDetails(){
            System.out.println(screenType);

        }
        public static void main (String args[]){
            PremiumMovie p1=new PremiumMovie("og",250,"IMAX");
           
            System.out.println(p1.movieName);
            System.out.println(p1.ticketPrice);
            System.out.println(p1.screenType);
            


        }
}

