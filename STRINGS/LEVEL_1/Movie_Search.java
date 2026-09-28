import java.util.Scanner;
public class Movie_Search {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter movie name");
        String user=sc.next();
        String movie1="RRR";
        String movie2="Bahubali";
        String movie3="Pushpa";
        if(user.equals(movie1)||user.equals(movie2)|| user.equals(movie3)){
            System.out.println("movie found");
        }
        else{
            System.out.println("Movie not found");
        }
    }
    
}
