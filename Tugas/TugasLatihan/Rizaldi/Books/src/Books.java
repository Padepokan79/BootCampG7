
public class Books extends Author{
	String nameBook;
	Double price;
	int qty;
	Author author = new Author();
	public Books(Author author, String namaBuku, Double harga) {
//		super(nama, mail, jKelamin);
		this.author = author;
		nameBook	= namaBuku;
		price		= harga;
	}
	
	public Books(Author author, String namaBuku, Double harga, int jml) {
//		super(nama, mail, jKelamin);
		this.author = author;
		nameBook	= namaBuku;
		price		= harga;
		qty			= jml;
	}
	public Books() {
		
	}
	
	String getNameBook() {
		return nameBook;
	}
	
	Author getAuthor() {
		return author;
	}
	
	Double getPrice() {
		return price;
	}
	
	int getQty() {
		return qty;
	}
	
	void setPrice(double priceBook) {
		price=priceBook;
	}
	
	void setQty(int qtyBook) {
		qty=qtyBook;
	}
	
	public String toString() {
		return "Book[name = "+nameBook+", "+author.toString()+", price = "+price+"]";
	}
	public String triString() {
		return "Book[name = "+nameBook+", "+author.toString()+", price = "+price+", quantity = "+qty+"]";
	}
	
}
