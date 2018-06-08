package ChaudryHendraRyan;

public class Asus extends Laptop{
	
	public Asus() {
		
	}
	
	public Asus (String nama, String merek, String proseccor, double ukuranLayar,double clockSpeed,int harga,int ukuranRam,int ukuranHardisk) {
		super(nama, merek, proseccor, ukuranLayar, clockSpeed, harga, ukuranRam, ukuranHardisk);
	}
	
	public String toString()
	{
		return super.toString();
	}
	
	public void gaming() {
		System.out.println("Laptop ini cocok digunakan untuk Game Online");
	}
}
