package RizaldiRicha;
import java.util.Random;

public class Pakaian {
	private String ukuran, warna, merek, jenisBahan,madeIn;
	private double harga;
	Random rand = new Random();
	
	public Pakaian() {
		
	}
	
	public Pakaian(String ukuran, String warna, String merek, String jenisBahan, String madeIn, double harga) {
	this.ukuran = ukuran;
	this.warna = warna;
	this.merek = merek;
	this.jenisBahan = jenisBahan;
	this.madeIn = madeIn;
	this.harga = harga;
	}
	
	public String getUkuran() {
		return ukuran;
	}
	
	public String getWarna() {
		return warna;
	}
	
	public String getMerek() {
		return merek;
	}
	
	public String getJenisBahan() {
		return jenisBahan;
	}
	
	public String getMadeIn() {
		return madeIn;
	}
	
	public Double getHarga() {
		return harga;
	}
	public void setWarna(String warna) {
		this.warna = warna;
	}
	
	public void setUkuran(String ukuran) {
		this.ukuran = ukuran;
	}
	
	public void mahal() {
		if(harga > 10000)
		{
			System.out.println("Barang Mahal!!");
		}
		else {
			System.out.println("Barang Murah!!");
		}
	}
	
	public void gender() {
		
		if(warna.equals("pink") || warna.equals("kuning")) {
			System.out.println("Cocok untuk cewek");
			
		}
		else {
			System.out.println("Cocok untuk Laki-laki");
		}
	}
	
	public void merek() {
		if(merek.equals("nike") || merek.equals("adidas") ) {
			harga = rand.nextInt(799999)+200000;
		}
		else
		{
			harga =  rand.nextInt(199999)+1;
		}
	}
	
	public void ukuran() {
		if(ukuran.equals("S")||ukuran.equals("M")) {
			harga = harga - 15000;
		}
		else if(ukuran.equals("L")||ukuran.equals("XL")) {
			harga = harga + 10000;
		}
	}
	
	public String tampil() {
		merek();
		mahal();
		ukuran();
		gender();
		return "kamu memakai pakaian dengan ukuran " + ukuran + " memiliki warna " + warna + " dengan merek " + merek + " jenis bahannya " + jenisBahan + " dibuat di " + madeIn + " dengan harga " + harga; 
	}
}
