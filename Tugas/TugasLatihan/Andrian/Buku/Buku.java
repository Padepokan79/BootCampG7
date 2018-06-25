package Buku;

public class Buku extends Author {
	private String nameBook; 
	private Author author;
	private double price;
	private int qty=0;

	//Construction
	public Buku (String nameBook, Author author, double price) {
		this.nameBook = nameBook;
		this.price = price;
		this.author = author;
	}
	
	public Buku (String nameBook, Author author, double price, int qty) {
		this.author = author;
		this.nameBook = nameBook;
		this.price = price;
		this.qty = qty;
	}
	
	//Method
	
	String getNameBook() {
		return this.nameBook;
	}
	
	Author getAuthor() {
		return author;
	}
	
	double getPrice() {
		return this.price;
	}
	
	void setPrice(double price) {
		this.price = price;
	}
	
	int getQty() {
		return this.qty;
	}
	
	void setQty(int qty) {
		this.qty=qty;
	}
	
	public String toString() {
		return "Book "+nameBook+" ,"+ author.toString() +" ,price "+price+" ,Quantity "+qty;
	}
	
	public String triString() {
		return "Book "+nameBook+" ,"+ author.toString() +" ,price "+price;
	}
}
