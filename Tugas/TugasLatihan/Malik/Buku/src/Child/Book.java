package Child;

import Parent.Author;

public class Book extends Author{
	private String name;
	private double price;
	private int qty=0;
	private Author author;
	
	public Book(){
		
	}
	
	public Book(String name, Author author, double price) {
		this.name 	= name;
		this.author = author;
		this.price 	= price;
	}
	
	public Book(String name, Author author, double price, int qty) {
		this.name 	= name;
		this.author = author;
		this.price 	= price;
		this.qty 	= qty;
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
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString() {
		return "Book[ name = "+name+", "+author+", price = "+price+", qty = "+qty+" ]";
	}
}
