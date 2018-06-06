
public class Book extends Author {
	private String name;
	private Author author;
	private double price;
	private int qty;
	
	public Book() {
	}
	
	public Book(String name, Author author, double price) {
		this.name 	= name;
		this.author	= author;
		this.price 	= price;
	}
	
	public Book(String name, Author author, double price, int qty) {
		this.name 	= name;
		this.author	= author;
		this.price 	= price;
		this.qty 	= qty;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public int getQty() {
		return qty;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	
	void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString() {
		return "Book[name=" +name+","+author+",price="+price+",qty="+qty+"]";
	}
}