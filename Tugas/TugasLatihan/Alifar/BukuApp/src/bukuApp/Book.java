package bukuApp;

public class Book extends Author {
	private String name;
	private Author author=new Author();
	private double price;
	private int qty;
	
	public Book(String name, Author author, double price) {
		this.name=name;
		this.author=author;
		this.price=price;
	}
	
	public Book(String name, Author author, double price, int qty) {
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
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
	
	void setPrice(double price) {
		this.price=price;
	}
	
	int getQty() {
		return qty;
	}
	
	void setQty(int qty) {
		this.qty=qty;
	}
	
	public String toString() {
		return "Book[name="+name+", "+author.toString()+", price="+price+", qty="+qty+"]";
	}
}
