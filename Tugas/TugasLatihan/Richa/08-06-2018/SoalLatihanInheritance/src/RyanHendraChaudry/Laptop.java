/* 
Created by  		: Richa Fitria
Date/hour			: 06 Juni 2018/ 11.00 AM
Updated by			:
Updated Date/hour	:
*/

package RyanHendraChaudry;

public class Laptop {
	
	private String nama, merk, processor;
	private int harga, ukuranRAM, ukuranHardisk;
	private double ukuranLayar, clockSpeed;
	
	public Laptop (String nama, int harga, double ukuranLayar, int ukuranRAM, int ukuranHardisk, String merk, String processor, double clockSpeed) {
		this.nama = nama;
		this.harga = harga;
		this.ukuranLayar = ukuranLayar;
		this.ukuranRAM = ukuranRAM; //set
		this.ukuranHardisk = ukuranHardisk; //set
		this.merk = merk;
		this.processor = processor;
		this.clockSpeed = clockSpeed; //set
	}
	
	public Laptop () {
		
	}
	
	String getNama () {
		return nama;
	}
	int getHarga () {
		return harga;
	}
	double getUkuranLayar ( ) {
		return ukuranLayar;
	}
	int getUkuranRAM () {
		return ukuranRAM;
	}	
	void setUkuranRAM (int ram) {
		ukuranRAM = ram;
	}
	int getUkuranHD () {
		return ukuranHardisk;
	}
	void setUkuranHD (int hd) {
		ukuranHardisk = hd;
	}
	String getMerk () {
		return merk;
	}
	String getProcessor () {
		return processor;
	}
	double getClockSpeed ( ) {
		return clockSpeed;
	}
	void setClockSpeed (double cs) {
		clockSpeed = cs;
	}
	
	public String toString () {
		return "Nama laptop = " + nama + ", harga = " + harga + ", ukuran layar = " + ukuranLayar + " ukuran ram = " + ukuranRAM + ", ukuran HD " + ukuranHardisk + ", merk = " + merk + " Processor = " + processor + " clock speed " + clockSpeed;
	}
	
	
}
