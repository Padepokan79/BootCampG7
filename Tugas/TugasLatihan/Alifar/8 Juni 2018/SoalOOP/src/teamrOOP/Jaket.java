package teamrOOP;

public class Jaket extends Pakaian{
	String ketebalan, kupluk;
	
	public Jaket(String size, String color, double price, String merk, String substance, String made, String tebal, String ciput) {
		super(size, color, price, merk, substance, made);
		ketebalan=tebal;
		kupluk=ciput;
	}
	
	String getJenis() {
		return "\nJaket";
	}
	
	public String toString() {
		return super.toString()+"\nKetebalan = "+ketebalan+"\nKupuluk = "+kupluk;
	}

}
