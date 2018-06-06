package penulis;

public class Book extends Author{
	
	String name;
	int qty;
	double price;
	Author auth = new Author();
	char gender;
	
	public Book(String name, Author author, int price) {
//		super(name, email, gender);
		this.price = price;
	}
	
	public Book(String name, Author author, int price, int qty) {
//		super(name, email, gender);
		this.price = price;
		this.qty = qty;
	}
	
	String getName(){
		return name;
	}
	
	Author getAuthor(){
		return auth;
	}
	
	double getPrice(){
		return price;
	}
	
	void setPrice(double price){
		this.price = price;
	}
	
	int getQty(){
		return qty;
	}
	
	void setQty(int qty){
		this.qty = qty;
	}
	
	String printString (){
		return "Book [name=" + name + ", " + super.printString() + ", price=" + price + ", qty=" + qty + "]";
	}
}
