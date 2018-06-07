package book;

public class BookTest {
	public static void main(String[] args) {
		Book book = new Book("Vikri", "desta@gmail.com", 'M', "Dilan", 55000.0, 10);
		
		System.out.println(book.toString());
		
		book.setEmail("vikriramdani@gmail.com");
		book.setPrice(65000);
		book.setQty(15);
		
		System.out.println();
		System.out.println(book.toString());
	}
}
