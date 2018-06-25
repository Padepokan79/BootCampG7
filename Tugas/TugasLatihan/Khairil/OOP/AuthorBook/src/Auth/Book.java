package Auth;

public class Book extends Author {
	String name;
	private Author author;
	private int qty;
	private double price;
	
	public Book(String name, Author author, double price) {
		this.author = author;
		this.name = name;
		this.price = price;
	}
	
	public Book(String name, Author author, double price, int qty) {
		this.author = author;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public int getQty() {
		return qty;
	}
	
	public String toString() {
		return "Book[name=" + getName() + "," + author + ",price=" + getPrice() + ",qty=" + getQty() + "]";
	}
}
