package ObjectMethods;

public class Book {
int bookId;
String title;
int price;
Book(int bookId,String title,int price){
    this.bookId=bookId;
    this.title=title;
    this.price=price;
}
@Override 
public String toString(){
    return "Book ID:"+bookId+"\n"+"Title:" +title+"\n"+" price:"+price;

}
public static void main(String args[]){
    Book b1=new Book(123,"the rise",345);
    System.out.println(b1.toString());
}
}

