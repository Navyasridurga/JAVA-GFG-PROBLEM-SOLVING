package ObjectMethods;

public class Movie_Equality {

    String movieName;
    Movie_Equality(String movieName){
        this.movieName=movieName;
    }
    public boolean equals(Object obj){
        Movie_Equality movie2=(Movie_Equality)obj;
        return this.movieName==movie2.movieName;
    }
    public static void main(String args[]){
        Movie_Equality m1=new Movie_Equality("nani");
        Movie_Equality m2=new Movie_Equality("paradise");
        System.out.println(m1.equals(m2));
    }
}
