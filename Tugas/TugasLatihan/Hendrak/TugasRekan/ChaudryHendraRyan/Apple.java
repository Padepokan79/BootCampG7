package ChaudryHendraRyan;

public class Apple extends Laptop{
	public Apple() {
		
	}
	
	public Apple (String nama, String merek, String proseccor, double ukuranLayar,double clockSpeed,int harga,int ukuranRam,int ukuranHardisk) {
		super(nama, merek, proseccor, ukuranLayar, clockSpeed, harga, ukuranRam, ukuranHardisk);
	}
	
	public String toString()
	{
		return super.toString();
	}
	
	public void mengetik()
	{
		System.out.println("Laptop ini cocok di gunakan untuk Menulis sebuah novel");
	}
}
