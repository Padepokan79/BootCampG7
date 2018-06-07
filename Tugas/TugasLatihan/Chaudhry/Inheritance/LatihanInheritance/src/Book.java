
public class Book extends Author {
	private String name;
	private double price;
	private int qty = 0;
	private Author author;
	public Book() {
		
	}
	public Book(String namaBuku, Author author, double price ) {
		name = namaBuku;
		this.author = author;
		this.price = price;
	}
	public Book(String namaBuku, Author author, double price, int qty ) {
		name = namaBuku;
		this.author = author;
		this.price 	= price;
		this.qty 	= qty;
	}
	
	void setPrice(double price) {
		this.price = price;
	}
	void setQty(int qty) {
		this.qty = qty;
	}
	
	String getName() {
		return name;
	}
	Author getAuthor() {
		return author;
	}
	double getPrice() {
		return price;
	}
	int getQty() {
		return qty;
	}
	
	public String toString() {
		return "Nama buku : "+ getName() + ", " + getAuthor() +", harga : "+ getPrice() +", Jumlah : "+ getQty();
	}
	
}
