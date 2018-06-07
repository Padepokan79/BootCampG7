
public class Book extends Author{
	
	private String name;
	private double price;
	private int qty=0;
	private Author author;
	
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
	
	String getName() {
		return name;
	}
	Author getAuthor() {
		return author;
	}
	Double getPrice() {
		return price;
	}
	void setPrice(double setPrice) {
		price = setPrice;
	}
	int getQty() {
		return qty;
	}
	void setQty(int setQty) {
		qty = setQty;
	}
	public String toString() {
		return "Book [Nama = "+name+"]\n"+author.toString()+"\nPrice = Rp."+price+"\nQuantity = "+qty;
	}
}
