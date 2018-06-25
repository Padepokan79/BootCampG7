// Created By vikri
// 22/06/2018

package warung;

public class Warung {
	private String namaBarang;
	private double harga, qty;
	
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	
	public Warung() {
		
	}
	public String getNamaBarang() {
		return namaBarang;
	}
	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}
	public double getHarga() {
		return harga;
	}
	public void setHarga(double harga) {
		this.harga = harga;
	}
	public Warung(String nama, double harga, double qty) {
		namaBarang = nama;
		this.harga = harga;
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return 	"Nama Barang: "+namaBarang+"\n"+
				"Harga :"+harga+"\n"+
				"Qty: "+qty+
				"\n";
	}
}
