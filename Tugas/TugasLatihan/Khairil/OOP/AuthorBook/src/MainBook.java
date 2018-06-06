import Auth.Author;
import Auth.Book;

public class MainBook {

	private static Author pengarang;
	private static Book buku;
	private static Book buku1;

	public static void main(String[] args) {
		
		pengarang = new Author("Khairil Anwar", "khairil12345@gmail.com", 'm');
		System.out.println( pengarang.toString() );
		
		buku = new Book("Ketika Dunia Huru Hara", pengarang, 150000.0);
		System.out.println( buku.toString() );
		
		buku1 = new Book("Aku ingin hidup 1000 tahun", pengarang, 110000.0, 115);
		System.out.println( buku1.toString() );
		
	}

}