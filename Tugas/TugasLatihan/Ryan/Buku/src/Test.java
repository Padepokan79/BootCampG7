
public class Test {
	public static void main(String[] args) {
		Author auth = new Author("Ryan", "r4hmadn@gmail.com", 'm');
		Book book = new Book("Catatan Juang", auth, 85000);
		Book book1 =  new Book("Garis Waktu", auth, 20000, 12);
		
		System.out.println(book1.toString());
	}

}
