package ChaudryHendraRyan;

public class Laptop {
	private  String nama, merek, proseccor;
	private double ukuranLayar, clockSpeed;
	private int harga, ukuranRam, ukuranHardisk;
	
	public Laptop() {
		
	}
	
	public Laptop(String nama, String merek, String proseccor, double ukuranLayar,double clockSpeed,int harga,int ukuranRam,int ukuranHardisk) {
		this.nama = nama;
		this.merek = merek;
		this.proseccor = proseccor;
		this.ukuranLayar = ukuranLayar;
		this.clockSpeed = clockSpeed;
		this.harga = harga;
		this.ukuranRam = ukuranRam;
		this.ukuranHardisk = ukuranHardisk;
	}
	
	public int getHarga() {
		return harga;
	}
	
	public void setHarga(int harga) {
		this.harga = harga;
	}
	
	public String toString() {
			return "Nama           : " + nama + "\n" +
				   "Merek          : " + merek+ "\n" +
				   "Proseccor      : " + proseccor + "\n"+
				   "Ukuran Layar   : " + ukuranLayar + " Inch\n"+
				   "Clock Speed    : " + clockSpeed + " Ghz\n" +
				   "Ukuran Ram     : " + ukuranRam + " Gb\n" +
				   "Ukuran Hardisk : " + ukuranHardisk + " Tb\n" +
				   "Harga          : Rp." + harga + ""
				   ;
	}
}
