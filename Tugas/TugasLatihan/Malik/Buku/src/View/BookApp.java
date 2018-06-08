package View;

import Child.Book;
import Parent.Author;

public class BookApp {

	public static void main(String[] args) {
		Author ath 	= new Author("Malik", "malik@gmail.com", 'm');
		Book buk1 	= new Book("Islam", ath, 10000);
		Book buk2 	= new Book("Atlas", ath, 50000, 12);
		
		System.out.println();
		System.out.println("AUTHOR");
		System.out.println(ath.toString());
		System.out.println();
		
		System.out.println();
		System.out.println("BOOK1");
		System.out.println(buk1.toString());
		System.out.println();
		
		System.out.println();
		System.out.println("BOOK2");
		System.out.println(buk2.toString());
		System.out.println();
		
		System.out.println();
		System.out.println("CHANGE VALUE");
		ath.setEmail("Chandr@gmail.com");
		buk1.setPrice(150000);
		buk2.setQty(50);
		System.out.println(ath.toString());
		System.out.println(buk1.toString());
		System.out.println(buk2.toString());
		System.out.println();
	}

}
