package book;

public class Book extends Author{
	private String bookName;
	private int qty;
	private Double price;
	public Book() {
		
	}
	public Book(String name, String email, char gender,String bookname, Double price) {
		super(name, email, gender);
		
		bookName = bookname;
		this.price = price;
	}
	public Book(String name, String email, char gender,String bookname, Double price, int qty) {
		super(name, email, gender);
		
		bookName = bookname;
		this.price = price;
		this.qty = qty;
	}
	
	String getBookName() {
		return bookName;
	}
	
	double getPrice() {
		return price;
	}
	
	int getQty() {
		return qty;
	}
	
	void setPrice(double price) {
		this.price = price;
	}
	
	void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString() {
		return 	"Book Name: "+bookName+"\n"
				+"Author\n"
				+super.toString()
				+"Price: Rp. "+price+"\n"
				+"qty: "+qty+" Pcs";
	}
}
