import java.util.*;
public class RunApp {

	public static void main(String[] args) {
		
		String email;
		Double harga;
		int qty;
		Scanner kb = new Scanner(System.in);
		// TODO Auto-generated method stub
		Author auth1 = new Author("Rizaldi", "Rizal@di.com", 'm');
		System.out.println(auth1.toString());
		
		System.out.println("Masukkan email\t: ");
		email = kb.next();
		auth1.setMail(email);
		
		
		
		Books book1 = new Books(auth1, "laskar pelatih", 900000.0);
		System.out.println(book1.toString());
		
		Books book2 = new Books(auth1, "laskar pelatih", 900000.0, 50);
		System.out.println(book2.triString());
		
		
		System.out.println("Masukkan jumlah\t: ");
		qty = kb.nextInt();
		book2.setQty(qty);
		System.out.println(book2.triString());
		
		System.out.println("Masukkan harga\t: ");
		harga = kb.nextDouble();
		book2.setPrice(harga);
		System.out.println(book2.triString());
	}

}
