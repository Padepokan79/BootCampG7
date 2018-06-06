/* 
Created by  		: Richa Fitria
Date/hour			: 05 Juni 2018/ 03.26 PM
Updated by			:
Updated Date/hour	:
*/

public class Book extends Author {

	private String nameBook;
	private double price;
	private int qty=0;
	
	Author au = new Author ();
	
	public Book (String name, String email, char gender, String namaBuku, double harga) {
		super (name, email, gender);
		nameBook = namaBuku;
		price = harga;
	}
	public Book (String name, String email, char gender, String namaBuku, double harga, int kuantitas) {
		super (name, email, gender);
		nameBook = namaBuku;
		price = harga;
		qty = kuantitas;
	}
	
	public Book () {
		nameBook = "Dilan 1990";
		price = 79000;
		qty = 2;
	}
	
	String getName () {
		return nameBook;
	}
	
	Author getAuthor (String nama, String mailing, char jenisKelamin) {
		nama = au.getName();
		mailing = au.getEmail();
		jenisKelamin = au.getGender();
		return new Author (nama,mailing, jenisKelamin);
	}
	
	double getPrice () {
		return price;
	}
	
	void setPrice (double hrg) {
		price = hrg;
	}
	
	int getQty () {
		return qty;
	}
	
	void setQty (int quantity) {
		qty = quantity;
	}

	public String toString () {
		return "Book name = " + nameBook + ", " + super.toString () + ", price = " + price + ", qty = " + qty; 
	}
	
	
	
}
