import java.util.Scanner;
public class Movie_Ticket {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int seats[]={0,0,0,0};
    
    String book;
   int index=0;
do{
    System.out.println("Select seat"+(index)+1);
    seats[index]=1;
    System.out.println("Do you want to select another seat");
    System.out.println("yes or no");
    book=sc.next();

        index++;
}

while(book.equals("yes")&&index<seats.length);
System.out.println("enter seats ");
    System.out.println("Seats booked");
for(int i=0;i<seats.length;i++){
    System.out.print(seats[i]+" ");
}


System.out.println("booking completed");


}


}


