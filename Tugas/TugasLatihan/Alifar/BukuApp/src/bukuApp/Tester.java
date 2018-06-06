package bukuApp;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a1=new Author("J.K Rowling", "harry@potter.com", 'f');
		System.out.println(a1.toString());
		
		Book b1=new Book("The Sorcery Stones", a1, 90000,5);
		System.out.println(b1.toString());
		
		a1.setEmail("asd@azz.com");
		b1.setQty(10);
		System.out.println(b1.toString());
	}

}
