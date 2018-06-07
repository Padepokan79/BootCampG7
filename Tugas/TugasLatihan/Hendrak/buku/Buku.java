//Created by : Hendra Kurniawan
//Date : 6 Juni 2018 Time : 3:58 AM
//Modified :

public class Buku extends Author{
	private String bookName;
	private double price;
	private int qty=0;
	private Author author;
	
	public Buku() {
		
	}
	
	public Buku(String bookName, Author author, double price) {
		this.author = author;
		this.bookName = bookName;
		this.price= price;

	}
	
	public Buku(String bookName, Author author, double price, int qty) {
		this.author = author;
		this.bookName = bookName;
		this.price= price;
		this.qty = qty;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public Author getAuthor() {
		return author;
	}
	void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty;
	}
	
	void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString() {
		return "Book[name= " + bookName + ", "+ author + ", price= "+price + ", qty= "+qty + " ]" ;
	}
}
