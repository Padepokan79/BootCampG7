
public class ShowBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author = new Author("Yana", "yana@gmail.com", 'L');
		
		System.out.println("\nAUTHOR");
//		System.out.println(author.getName());
//		System.out.println(author.getEmail());
//		System.out.println(author.getGender());
		author.setEmail("yana@yahoo.mail");
		System.out.println(author.toString());
		
		Book book = new Book("Rekayasa Perangkat Lunak", author, 250000);
		Book book2 = new Book("Dilan 1990 :v", author, 50000, 2);
		
		System.out.println("\nBOOK1");
//		System.out.println(book.getName());
//		System.out.println(book.getAuthor());
//		System.out.println(book.getPrice());
//		System.out.println(book.getQty());
		book.setPrice(30000);
		System.out.println(book.toString());
		
		System.out.println("\nBOOK2");
//		System.out.println(book2.getName());
//		System.out.println(book2.getAuthor());
//		System.out.println(book2.getPrice());
//		System.out.println(book2.getQty());	
		book2.setPrice(60000);
		book2.setQty(5);
		System.out.println(book2.toString());
	}

}
