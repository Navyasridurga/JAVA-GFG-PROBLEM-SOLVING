package Copy;

public class Book {
	String title;
	String author;
	int pages;

}
 class Main1{
	public static void main(String[] args) {
		Book b1=new Book();
		System.out.println(b1.title="hello");
		System.out.println(b1.author="nenu");
		System.out.println(b1.pages=90);
		Book b2=new Book();
		System.out.println(b2.title=b1.title);
		System.out.println(b2.author=b1.author);
		System.out.println(b2.pages=b1.pages);
	}
	
}
