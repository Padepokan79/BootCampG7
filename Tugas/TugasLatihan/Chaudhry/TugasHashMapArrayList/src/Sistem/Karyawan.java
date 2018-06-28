/*
 * DATE CREATED : 25 Juni 2018
 * AUTHOR       : NURDHIAT CHAUDHARY MALIK
 * */

package Sistem;

public abstract class Karyawan {
	String nama, nik, penempatan, tingkatan, posisi;
	
	public Karyawan(String nama, String nik, String penempatan, String posisi, String tingkatan) {
		this.nama = nama;
		this.nik = nik;
		this.penempatan = penempatan;
		this.tingkatan = tingkatan;
		this.posisi = posisi;
	}
	
	String getNama() {
		return nama;
	}
	String getNik() {
		return nik;
	}
	String getPenempatan() {
		return penempatan;
	}
	String getTingkatan() {
		return tingkatan;
	}
	String getPosisi() {
		return posisi;
	}
	
	public void tampilData() {
		System.out.println("Nama           : "+getNama());
		System.out.println("NIK            : "+getNik());
		System.out.println("Penempatan     : "+getPenempatan());
		System.out.println("Pengalaman     : "+getTingkatan());
		System.out.println("Posisi         : "+getPosisi());
	}
}
