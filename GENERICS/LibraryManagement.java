import java.util.Arrays;
class LibraryManagement<T,U>
{
    private T bookId;
    private U bookName;
    private String authors[];
    private double price;
    


public LibraryManagement(T bookId,U bookName,String authors[],double price){
    this.bookId=bookId;
    this.bookName=bookName;
    this.authors=authors;
    this.price=price;
}
public void setbookId(T bookId){
    this.bookId=bookId;
}
public T getbookId(){
    return bookId;
}
public void setbookName(U bookName){
    this.bookName=bookName;
}
public U getbookName(){
    return bookName;
}
public  void setauthors(String authors []){
    this.authors=authors;

} 
public String[] getauthors(){
    return authors;
}
public void setprice(double price){
    this.price=price;

}
public double getprice(){
    return price;
}
public void displayDetials(){
    System.out.println("BookId:"+bookId);
    System.out.println("BookName:"+bookName);
    System.out.println("Authors:"+Arrays.toString(authors));
    System.out.println("Price:"+price);
  
}
public int getAuthorCount(){
return 
}
}